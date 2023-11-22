package com.Khelmart.Logesh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class searchdata {
	 public String url;
	 public String email;
	public String password;
	public String username;
	public String lastname;
	public String cpassword;
	public String search;
	public String search1;
	public String loginemail;
	public String zip;
	public  searchdata() {
		
		data();
	}
	public void data() {
		File file = new File("C:\\Users\\lsrinivasan\\project\\Khelmart\\Khelmart\\src\\test\\resource\\property.properties");
		FileInputStream fio =null;
		try {
			fio = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fio);
		} catch (IOException e) {
			e.printStackTrace();
		}
		zip=prop.getProperty("pin");
		loginemail=prop.getProperty("email1");
		username=prop.getProperty("username");
		lastname=prop.getProperty("lastname");
		cpassword=prop.getProperty("cpassword");
		search=prop.getProperty("search");
		search1=prop.getProperty("search1");
		url = prop.getProperty("Url");
		email = prop.getProperty("Email");
	    password = prop.getProperty("Password");
	}
}
