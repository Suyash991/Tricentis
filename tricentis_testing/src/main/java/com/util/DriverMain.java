package com.util;

import org.openqa.selenium.WebDriver;

public class DriverMain {

	public static void main(String[] args) {
	DriverFactory d= new DriverFactory();
	d.init_driver("chrome");
	WebDriver dd=d.init_driver("chrome");
	dd.get("https://stackoverflow.com/questions/24289838/cucumber-unable-to-find-step-definition/24301975");

	}

}
