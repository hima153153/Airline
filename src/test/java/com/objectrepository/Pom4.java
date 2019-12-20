package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stepdef.Hooks;

public class Pom4 {
	public Pom4() {
		PageFactory.initElements(Hooks.driver, this);
	}

@FindBy(xpath="//input[@id='logout']")
private WebElement logout;

public WebElement getLogout() {
	return logout;
}

}
