package com.resourses;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.stepdef.Hooks;

public class BaseClass {
	
	
	public static void launch(String url) {
		Hooks.driver.get(url);	
	}

	public static void type(WebElement w,String s) {
		w.sendKeys(s);
	}
	public static void clik(WebElement w) {
		w.click();
	}
	public static void dropdownselect(WebElement w,String st) {
		Select s=new Select(w);
		s.selectByVisibleText(st);		
	}
	public static void alertaccept() {
		Alert a=Hooks.driver.switchTo().alert();
		a.accept();

	}
	
	
	
	
	
	
	
}


