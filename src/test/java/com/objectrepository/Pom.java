package com.objectrepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stepdef.Hooks;

public class Pom {	

	public Pom() {
		PageFactory.initElements(Hooks.driver,this);
	}

@FindBy(xpath=" //input[@id='username']")
private WebElement user;

@FindBy(xpath="//input[@id='password']")
private WebElement pass;



public WebElement getUser() {
	return user;
}

public WebElement getPass() {
	return pass;
}

public List<WebElement> getBtn() {
	return btn;
}
@FindBy(xpath="//input[@id='login']")
private List< WebElement > btn;
}
	