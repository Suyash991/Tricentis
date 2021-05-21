package com.tricentis.pages;

import com.util.DriverFactory;

public class maindef {

	public static void main(String[] args) {
	CartPage page =new CartPage(DriverFactory.getDriver());
	page.selectItem();

	}

}
