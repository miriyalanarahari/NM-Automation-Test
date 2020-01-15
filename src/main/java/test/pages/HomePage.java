package test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.base.BaseTest;


public class HomePage extends BaseTest {

	@FindBy(xpath="//a[@title='Women']")
	 WebElement Menu;
	
	@FindBy(linkText="Summer Dresses")
	 WebElement Submenu;
	
		
	public HomePage()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void selectMenu()
	{
		Actions Action=new Actions(driver);
		
		Action.moveToElement(Menu).build().perform();
			
						
	}
	
	public void selectSubMenu()
	{
		Submenu.click();
							
	}
	
	
	
}
