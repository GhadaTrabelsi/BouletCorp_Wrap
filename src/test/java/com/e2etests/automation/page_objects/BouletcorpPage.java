package com.e2etests.automation.page_objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;


public class BouletcorpPage {
	
	public ConfigFileReader configFileReader;
    public  WebDriverWait wait;

	/* Retrieve Element */
 

	/*this variable emailLocator represents a locator 
	     * strategy for locating a web element with an id 
	     * attribute value of "alertButton".
	     */
	private static WebDriver driver = Setup.getDriver();
	
	private static By btnAleatoire = By.xpath("//div[@id='tabvanilla']//a[contains(text(),'Aléatoire')]");
	private static By facebookWidget = By.xpath("//img[@title='Facebook']");
	private static By twitterWidget = By.xpath("//img[@title='Twitter']");
	private static By tumblrWidget = By.xpath("//a[@title='Share on Tumblr']");

	
	/*this code will locate a web element on the web page
	*  using the emailLocator mechanism and return it
	*   as a WebElement object.
	*/
	public static WebElement getAleattBtn() {
		return driver.findElement(btnAleatoire);
	}
	public static WebElement getFacebook() {
		return driver.findElement(facebookWidget);
	}
	public static WebElement getTwitter() {
		return driver.findElement(twitterWidget);
	}
  
	public static WebElement getTumblr() {
		return driver.findElement(tumblrWidget);
	}
	


	/*this code is creating a WrapsElement object that wraps the emailElement 
	* object obtained by calling the getEmailElement() method,
	* and then returning the underlying WebElement object wrapped
	* by this WrapsElement object.
	*/
	public static WebElement getBouletCorpWrappedElement(WebElement webelement ) {
		WrapsElement wrappedBouletCorpwebelement = new WrapsElement() {
			public WebElement getWrappedElement() {
				return webelement;
			}
		};
		return wrappedBouletCorpwebelement.getWrappedElement();

}
	
	
}
