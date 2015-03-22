package com.nesler.risk.risk2210;

import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;

import com.nesler.risk.risk2210.TerritoryConstants.Territories;

public class ContinentConstants {
	
	//not sure if this should have an index number as well. . . why not do string keys? Benefits/drawbacks?
	public enum Continents {
		AFRICA("Africa", 4, 0), 
		ASIA("Asia", 5, 1), 
		AUSTRALIA("Australia", 3, 2), 
		EUROPE("Europe", 4, 3), 
		NORTH_AMERICA("North America", 4, 4), 
		SOUTH_AMERICA("South America", 3, 5);
		
		private String displayName;
		private int bonus;
		private int index;
		
		Continents(String displayName, int bonus, int index){
			this.displayName = 	displayName;
			this.bonus = bonus;
			}
		
		public String getDisplayName() {
			return displayName;
		}

		public int getBonus() {
			return bonus;
		}

		public int getIndex() {
			return index;
		}
	}
}
