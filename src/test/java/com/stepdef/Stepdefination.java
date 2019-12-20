package com.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;

import com.objectrepository.Pom;
import com.objectrepository.Pom1;
import com.objectrepository.Pom2;
import com.objectrepository.Pom3;
import com.objectrepository.Pom4;
import com.resourses.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefination extends BaseClass {
	Pom p = new Pom();
	Pom1 p1 = new Pom1();
	Pom2 p2 = new Pom2();
	Pom3 p3 = new Pom3();
	Pom4 p4 = new Pom4();

	@Given("launch the url")
	public void launch_the_url() {
		launch("https://www.adactin.com/HotelApp/");
		Hooks.driver.manage().window().maximize();
		Hooks.driver.manage().timeouts().implicitlyWait(900, TimeUnit.SECONDS);
	}

	@When("Enter username")
	public void enter_username() {
		type(p.getUser(), "bindu153");

	}

	@When("Enter password")
	public void enter_password() {
		type(p.getPass(), "hima@1988");
	}

	@When("click loginbutton")
	public void click_loginbutton() {
		clik(p.getBtn().get(0));
	}

	@When("user search hotel")
	public void user_search_hotel() {
		dropdownselect(p1.getLocation(), "London");
		dropdownselect(p1.getHotel(), "Hotel Sunshine");
		dropdownselect(p1.getRoomtype(), "Deluxe");
		dropdownselect(p1.getNoofrooms(), "2 - Two");
		type(p1.getDatein(), "19/12/2019");
		type(p1.getDateout(), "20/12/2019");
		dropdownselect(p1.getAdultroom(), "3 - Three");
		dropdownselect(p1.getChildroom(), "2 - Two");
		clik(p1.getSearch());
	}
	
	@When("user book a hotel")
	public void user_book_a_hotel() {
		clik(p2.getRadiobtn());
		clik(p2.getContin());
		type(p2.getFirstname(),"HIMA");
		type(p2.getLastname(),"BINDU");
		type(p2.getAddress(),"304,oceanbreeze");
		type(p2.getCreditno(),"1234567898765432");
		dropdownselect(p2.getCredittyp(),"American Express");
		dropdownselect(p2.getExpmnth(),"November");
		dropdownselect(p2.getExpyr(),"2021");
		type(p2.getCvvno(),"153");
		clik(p2.getBooknw());
		
	}
	@When("user Booked Itinerary")
	public void user_Booked_Itinerary() {
	   clik(p3.getMyitinebtn());
	   clik(p3.getCheckbx());
	   clik(p3.getCancelbtn());
	   alertaccept();
	}
	
	@When("user click the logout button")
	public void user_click_the_logout_button() {
		clik(p4.getLogout());
	   
	}

	@Then("user loggedout")
	public void user_loggedout() {
		System.out.println("user loggedout");
	   
	}
	
	



	
}