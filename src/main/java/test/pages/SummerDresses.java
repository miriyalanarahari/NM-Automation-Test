package test.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.base.BaseTest;

public class SummerDresses extends BaseTest {

	@FindBy(id = "selectProductSort")
	WebElement Sortdropdown;

	@FindBy(xpath = "//*[@id='center_column']/ul/li")
	List<WebElement> Productlist;

	@FindBy(xpath = "//*[@itemprop='name']")
	WebElement productname;

	@FindBy(xpath = "//*[@itemprop='price']")
	WebElement productprice;

	@FindBy(xpath = "//a[@title='Add to cart']")
	WebElement addToCart;

	@FindBy(xpath = "//span[@title='Continue shopping']")
	WebElement ContinueShopping;

	@FindBy(xpath = "//*[@title='View my shopping cart']")
	WebElement ViewCart;

	@FindBy(className = "cart_block_product_name")
	WebElement productintheCart;

	@FindBy(xpath = "//*[@class='cart_block_list']/dl/dt")
	List<WebElement> Productsinthecartlist;

	@FindBy(xpath = "//span[@class='price']")
	By priceaddedtocart;

	@FindBy(xpath = "//span[@title='Continue shopping']")
	By Continue;

	@FindBy(xpath = "//*[@class='remove_link']")
	WebElement removeItem;

	WebDriverWait Wait = new WebDriverWait(driver, 60);

	JavascriptExecutor js = (JavascriptExecutor) driver;

	public SummerDresses() {

		PageFactory.initElements(driver, this);

	}

	public void sortByPriceLowToHigh() {

		Select select = new Select(Sortdropdown);

		select.selectByVisibleText("Price: Lowest first");
	}

	public void validateSorting() {

		ArrayList<String> retreivedlist = new ArrayList<String>();
		ArrayList<String> sortedlist = new ArrayList<String>();

		for (int i = 0; i < Productlist.size(); i++) {

			String itemtotalDetails = Productlist.get(i).getText();

			String[] itemdetails = itemtotalDetails.split("\n");
			String itemtotalprices = itemdetails[1];

			String[] itemPricedetails = itemtotalprices.split(" ");
			String itemPrice = itemPricedetails[0];

			retreivedlist.add(itemPrice);
			sortedlist.add(itemPrice);
		}

		Collections.sort(sortedlist);
		if (sortedlist.equals(retreivedlist)) {
			System.out.println("Items are in Sorting order");
		} else
			System.out.println("Items are not in Sorting order, Sorting is not Working");

	}

	public String[] addRandomDress() {

		String[] productadded = new String[2];

		Actions Action = new Actions(driver);

		js.executeScript("arguments[0].scrollIntoView();", productname);

		Action.moveToElement(productname).build().perform();
		productadded[0] = productname.getText();
		productadded[1] = productprice.getText();

		addToCart.click();

		Wait.until(ExpectedConditions.elementToBeClickable(ContinueShopping));

		ContinueShopping.click();

		return productadded;

	}

	public void ValidateItemsAddedToCart(String dress, String price) {
		Actions Action = new Actions(driver);
		js.executeScript("arguments[0].scrollIntoView();", ViewCart);
		Action.moveToElement(ViewCart).build().perform();

		Wait.until(ExpectedConditions.visibilityOfElementLocated(priceaddedtocart));

		Assert.assertTrue(productintheCart.getAttribute("title").contains(dress));
		Assert.assertTrue(((WebElement) priceaddedtocart).getText().contains(price));

	}

	public void ClearCart() {

		Actions Action = new Actions(driver);
		Action.moveToElement(ViewCart).build().perform();

		for (int i = 0; i < Productsinthecartlist.size(); i++) {
			removeItem.click();

		}

	}

	public String[] addAnotherDifferentDress(String previouslyAddedDress, String previouslyAddedDressPrice) {

		int j = 1;
		String[] productadded = new String[2];
		Actions Action = new Actions(driver);
		String itemName = null;
		String itemprice = null;

		for (int i = 0; i < Productlist.size(); i++) {

			String itemtotalDetails = Productlist.get(i).getText();
			String[] itemdetails = itemtotalDetails.split("\n");

			itemName = itemdetails[0];

			String itemtotalprices = itemdetails[1];
			String[] itemPricedetails = itemtotalprices.split(" ");
			itemprice = itemPricedetails[0];

			if (!itemName.contains(previouslyAddedDress) || !itemprice.contains(previouslyAddedDressPrice)) {

				WebElement item = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[" + j + "]"));

				js.executeScript("arguments[0].scrollIntoView();", item);

				Action.moveToElement(item).build().perform();

				driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[" + j + "]/div/div[2]/div[2]/a[1]"))
						.click();

				Wait.until(ExpectedConditions.elementToBeClickable(ContinueShopping));

				ContinueShopping.click();
				break;
			} else
				j++;
		}

		productadded[0] = itemName;
		productadded[1] = itemprice;

		return productadded;

	}

	public void addItemToCart(String dress, String price) {
		
		Actions Action = new Actions(driver);

		int j = 1;

		for (int i = 0; i < Productlist.size(); i++) {
			String itemtotalDetails = Productlist.get(i).getText();
			String[] itemdetails = itemtotalDetails.split("\n");

			String itemName = itemdetails[0];
			String itemtotalprices = itemdetails[1];

			String[] itemPricedetails = itemtotalprices.split(" ");
			String itemPrice = itemPricedetails[0];

			if (itemName.contains(dress) && itemPrice.contains(price)) {
				
				WebElement item = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[" + j + "]"));

				js.executeScript("arguments[0].scrollIntoView();", item);
				
				Action.moveToElement(item).build().perform();

				driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[" + j + "]/div/div[2]/div[2]/a[1]"))
						.click();

				Wait.until(ExpectedConditions.elementToBeClickable(ContinueShopping));
				
				ContinueShopping.click();

			
				break;

			}

			j++;
		}

	}

}
