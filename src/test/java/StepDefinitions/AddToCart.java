package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import test.base.BaseTest;
import test.pages.HomePage;
import test.pages.SummerDresses;

public class AddToCart extends BaseTest {

	public String productname=null;
	public String productprice=null;

	@Given("^Website is Open$")
	public void website_is_Open() {

		BaseTest.initialisation();
		Assert.assertTrue(driver.getTitle().contains("My Store"));

	}

	@When("^Go to Women section$")
	public void go_to_Women_section() {

		HomePage homepage = new HomePage();
		homepage.selectMenu();

	}

	@When("^Navigate to summer dresses$")
	public void navigate_to_summer_dresses() {

		HomePage homepage = new HomePage();
		homepage.selectSubMenu();

		Assert.assertTrue(driver.getTitle().contains("Summer Dresses - My Store"));
	}

	@When("^Sort the items by price\\(Low to High\\)$")
	public void sort_the_items_by_price_Low_to_High() {
		SummerDresses summerdress = new SummerDresses();
		summerdress.sortByPriceLowToHigh();

		summerdress.validateSorting();

	}


	@Then("^Add a random dress to basket$")
	public void add_a_random_dress_to_basket() {
		SummerDresses summerdress = new SummerDresses();
		String Productaddedtocart[] = summerdress.addRandomDress();
		productname = Productaddedtocart[0];
		productprice = Productaddedtocart[1];
	}

	@Then("^Ensure that dress is added to cart$")
	public void ensure_that_dress_is_added_to_cart() {
		SummerDresses summerdress = new SummerDresses();
		try {
			summerdress.ValidateItemsAddedToCart(productname, productprice);
		} catch (Exception e) {
					e.printStackTrace();
		}

	}

	@Then("^Clear the cart$")
	public void clear_the_cart() {
		SummerDresses summerdress = new SummerDresses();
		summerdress.ClearCart();
	}

	@Then("^Add another dress to cart which is not same as the one which is added before$")
	public void add_another_dress_to_cart_which_is_not_same_as_the_one_which_is_added_before() {
		SummerDresses summerdress = new SummerDresses();
		String PreviouslyAddedDress = productname;
		String PreviouslyAddedDressPrice = productprice;
		String Productaddedtocart[] = summerdress.addAnotherDifferentDress(PreviouslyAddedDress, PreviouslyAddedDressPrice);
		productname = Productaddedtocart[0];
		productprice = Productaddedtocart[1];
	}
	
	@Then("^Add a dress \"([^\"]*)\" of price \"([^\"]*)\" to basket$")
	public void add_a_dress_of_price_to_basket(String dress, String price) {
		SummerDresses summerdress = new SummerDresses();
		summerdress.addItemToCart(dress, price);
	}
	
	@Then("^Ensure that dress \"([^\"]*)\" of price \"([^\"]*)\" is added to the cart$")
	public void ensure_that_dress_of_price_is_added_to_the_cart(String dress, String price) {

		SummerDresses summerdress = new SummerDresses();
		try {
			summerdress.ValidateItemsAddedToCart(dress, price);
		} catch (Exception e) {
					e.printStackTrace();
		}

	}

}
