package com.nesler.risk.test;

import java.io.ObjectInputStream.GetField;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.nesler.risk.base.Territory;
import com.nesler.risk.risk2210.TerritoryConstants;
import com.nesler.risk.risk2210.TerritoryConstants.Territories;

public class TestCreateTerritories {

	public static void main(String[] args) {
		final long startTime = System.nanoTime();
		final long endTime;
		final float endTimeSeconds;
		// Create all territories in TerritoryConstants, and put them in a TreeMap
		// Using Index as the Key and the Territory as the Value.
		TreeMap territoryMap = new TreeMap();
		for(Territories territory:Territories.values()){
			territoryMap.put(territory.getIndex(), new Territory(territory.getDisplayName(), 
																	territory.getType(), 
																	territory.getIndex()));
		}
		
		Set set = territoryMap.entrySet();
		Iterator iterator = set.iterator();
		
		// Retrieve the Key and Value from the hash map and 
		// print display name, territory type and number of armies on territory.
		while (iterator.hasNext()) {
			Map.Entry me = (Map.Entry) iterator.next();
			Territory terr = (Territory) me.getValue();

			System.out.print(me.getKey() + ": ");
	        System.out.println(terr.getDisplayName() + " of type " + 
	        					terr.getType() + " has " + 
	        					terr.getNumberofArmies() + " armies");
		}
		
		endTime = System.nanoTime() - startTime;
		endTimeSeconds = (float) endTime / 1000000000;
		System.out.println("\nThis test took  " + endTime + "ns  (" +endTimeSeconds + "s)");
	}

}
