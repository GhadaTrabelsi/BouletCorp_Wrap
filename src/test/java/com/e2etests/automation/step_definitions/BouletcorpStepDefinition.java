package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.BouletcorpPage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.SelectFromListUtils;
import com.e2etests.automation.utils.SeleniumUtils;
import com.e2etests.automation.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BouletcorpStepDefinition {


	public BouletcorpPage bouletcorpPage;
	public ConfigFileReader configFileReader;
	public SeleniumUtils utils;
	public SelectFromListUtils select;
	public Validations validation;
	
	public BouletcorpStepDefinition() {
		bouletcorpPage = new BouletcorpPage();
		configFileReader = new ConfigFileReader();
		utils = new SeleniumUtils();
		select = new SelectFromListUtils();
		validation = new Validations();
	}
	

	@Given("Je me connecte sur {string}")
	public void jeMeConnecteSur(String string) {
		utils.get(configFileReader.getProperties("home.url"));

	}
	@When("Je clique sur btn Aleatoire")
	public void jeCliqueSurBtnAleatoire() {
	   utils.click(BouletcorpPage.getBouletCorpWrappedElement(BouletcorpPage.getAleattBtn()));

	}
	@Then("La page change")
	public void laPageChange() {
		validation.assertNotEquals(configFileReader.getProperties("home.url"), utils.getCurrentUrl());

	}
	@Then("Les widgets Facebook Twitter et Tumblr sont affiches")
	public void lesWidgetsFacebookTwitterEtTumblrSontAffiches() {
		Boolean facebook = validation.isElementDisplayed(BouletcorpPage.getBouletCorpWrappedElement(BouletcorpPage.getFacebook() ));
		validation.assertTrue(facebook);
		Boolean twitter = validation.isElementDisplayed(BouletcorpPage.getBouletCorpWrappedElement(BouletcorpPage.getTwitter() ));
		validation.assertTrue(twitter);
		validation.assertTrue(facebook);
		Boolean tumblr = validation.isElementDisplayed(BouletcorpPage.getBouletCorpWrappedElement(BouletcorpPage.getTumblr() ));
		validation.assertTrue(tumblr);
	}



}
	

	


