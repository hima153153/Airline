package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stepdef.Hooks;

public class Pom3 {
	public Pom3() {
		PageFactory.initElements(Hooks.driver, this);
	}

@FindBy(xpath="//input[@id='my_itinerary']")
private WebElement myitinebtn;
@FindBy(xpath="//input[@name='check_all']")
private WebElement checkbx;
@FindBy(xpath="//input[@name='cancelall']")
private WebElement cancelbtn;


public WebElement getMyitinebtn() {
	return myitinebtn;
}
public WebElement getCheckbx() {
	return checkbx;
}
public WebElement getCancelbtn() {
	return cancelbtn;
}

}
