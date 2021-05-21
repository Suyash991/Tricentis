package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
private Properties prop;
/**
 * This method is used to load properties from config.prperties file
 * @return
 * @throws IOException
 */
public   Properties init_prop() throws IOException
{
	prop=new Properties();
	try {
		FileInputStream ip= new FileInputStream("C:\\Users\\samarth\\Documents\\Selenium\\tricentis_testing\\src\\main\\java\\com\\util\\config.properties");
		prop.load(ip);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return prop;
}
}
