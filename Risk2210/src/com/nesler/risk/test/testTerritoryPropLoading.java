package com.nesler.risk.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.nesler.risk.base.Territory;
import com.nesler.risk.initialize.InitializeTerritories;

public class testTerritoryPropLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOfTerritories = 0;
		HashMap<Integer, Territory> territoryMap = new HashMap<Integer, Territory>();
		
		InitializeTerritories initTerr = new InitializeTerritories();
		
		Properties properties = initTerr.getProperties();
		
		String quantity = properties.getProperty("territory.quantity");

		try{
			numberOfTerritories = Integer.parseInt(quantity);
		} catch (NumberFormatException e){
			throw new NumberFormatException("territory.quantity should be an integer value.");
			
		}
		
		
		for(int i = 0; i < numberOfTerritories; ++i){
			Territory territory = null;
			String displayName = properties.getProperty("territory." + i + ".name");
			String type = properties.getProperty("territory." + i + ".type");
			
			try {
				territory = new Territory(displayName, type, i);
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
			territoryMap.put(i, territory);
		}
		
		
		Set set = territoryMap.entrySet();
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext()){

			Map.Entry indexTerritoryPair = (Map.Entry) iterator.next();
			Territory terr = (Territory) indexTerritoryPair.getValue();

			System.out.print(indexTerritoryPair.getKey() + ": ");
	        System.out.println(terr.getDisplayName() + " of type " + 
	        					terr.getType() + " has " + 
	        					terr.getNumberofArmies() + " armies");
		}
		
	}

}
