package com.nesler.risk.risk2210;

import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;

import com.nesler.risk.risk2210.TerritoryConstants.Territories;

public class ContinentConstants {
	
	//not sure if this should have an index number as well. . . why not do string keys? Benefits/drawbacks?
	public enum Continents {
		AFRICA("Africa", 4), 
		ASIA("Asia", 5), 
		AUSTRALIA("Australia", 3), 
		EUROPE("Europe", 4), 
		NORTH_AMERICA("North America", 4), 
		SOUTH_AMERICA("South America", 3);
		
		private String displayName;
		private int bonus;
		
		
		Continents(String displayName, int bonus){
		this.displayName = 	displayName;
		this.bonus = bonus;
		}
	}
}
