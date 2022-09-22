package com.e2eTests.automation.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.pageObjects.AuthenticationOrnikPage;
import com.e2eTests.automation.utils.CommonMethods;
import com.e2eTests.automation.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthenticationOrnikStepDef {
	
	public WebDriver driver;
	private AuthenticationOrnikPage authenticationOrnikPage = new AuthenticationOrnikPage();
	private CommonMethods commonMethods = new CommonMethods();

	public AuthenticationOrnikStepDef() {
		driver = Setup.driver;
		PageFactory.initElements(driver, AuthenticationOrnikPage.class);
	}

	
	@Given("^je me connecte sur l'application ornikar$")
	public void jeMeConnecteSurLApplicationOrnikar() throws Throwable {
		commonMethods.openURLWithConfigFile("urlOrnikar");
	    
	}

	@When("^je click sur le bouton connection$")
	public void jeClickSurLeBoutonConnection() throws Throwable {
		authenticationOrnikPage.clickAuthenticationButton();
	   
	}

	@When("^je saisie username(\\d+) \"([^\"]*)\"$")
	public void jeSaisieUsername(int arg1, String arg2) throws Throwable {
		authenticationOrnikPage.fillUsername();
	    
	}

	@When("^je saisie le mot de passe(\\d+) \"([^\"]*)\"$")
	public void jeSaisieLeMotDePasse(int arg1, String arg2) throws Throwable {
		authenticationOrnikPage.fillPassword();
	  
	}

	@When("^je click sur le bouton connecte$")
	public void jeClickSurLeBoutonConnecte() throws Throwable {
		authenticationOrnikPage.clickLoginButton();
		
	    
	}

	@Then("^je verifie l'authentification$")
	public void jeVerifieLAuthentification() throws Throwable {
		authenticationOrnikPage.verifauthentification();
	   
	}

}
