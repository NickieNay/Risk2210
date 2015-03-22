package com.nesler.risk.initialize;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class InitializeTerritories {
	
	private Properties _properties;
	private String configFilePath = "territories.properties";
	
	public InitializeTerritories() {
		loadProperties(configFilePath);
	}
	
	private void createAllTerritories(){
		
	}
	
	public Properties getProperties(){
		return _properties;
	}
	
	private void loadProperties(String configFile){
		_properties = new Properties();
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(configFile);
		
		try {
			_properties.load(inputStream);
		} catch (Exception e) {
			System.out.println("Trouble loading file " + configFile + "\n" + e.getMessage());
		}
		
	}
	

}
