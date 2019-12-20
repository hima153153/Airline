package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stepdef.Hooks;

public class Pom2 {

	public Pom2() {
		PageFactory.initElements(Hooks.driver, this);
	}

@FindBy(xpath="//input[@type='radio']")
private WebElement radiobtn;
@FindBy(xpath="//input[@type='submit']")
private WebElement contin;
@FindBy(xpath="//input[@id='first_name']")
private WebElement firstname;
@FindBy(xpath="//input[@id='last_name']")
private WebElement lastname;
@FindBy(xpath="//textarea[@id='address']")
private WebElement address;
@FindBy(xpath="//input[@id='cc_num']")
private WebElement creditno;
@FindBy(xpath="//select[@name='cc_type']")
private WebElement credittyp;
@FindBy(xpath="//select[@class='select_combobox2'][1]")
private WebElement expmnth;
@FindBy(xpath="//select[@id='cc_exp_year']")
private WebElement expyr;
@FindBy(xpath="//input[@id='cc_cvv']")
private WebElement cvvno;
@FindBy(xpath="//input[@name='book_now']")
private WebElement booknw;
public WebElement getRadiobtn() {
	return radiobtn;
}
public WebElement getContin() {
	return contin;
}
public WebElement getFirstname() {
	return firstname;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCreditno() {
	return creditno;
}
public WebElement getCredittyp() {
	return credittyp;
}
public WebElement getExpmnth() {
	return expmnth;
}
public WebElement getExpyr() {
	return expyr;
}
public WebElement getCvvno() {
	return cvvno;
}
public WebElement getBooknw() {
	return booknw;
}






}