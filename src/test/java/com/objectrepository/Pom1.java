package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stepdef.Hooks;

public class Pom1 {
	public Pom1() {
		PageFactory.initElements(Hooks.driver, this);
	}

	@FindBy(xpath = "//select[@id='location']")
	private WebElement location;
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotel;
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement roomtype;
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement noofrooms;
	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adultroom;
	@FindBy(name = "datepick_in")
	private WebElement datein;
	@FindBy(name = "datepick_out")
	private WebElement dateout;
	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement childroom;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement search;

	
	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}
	
	public WebElement getSearch() {
		return search;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNoofrooms() {
		return noofrooms;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}
}
