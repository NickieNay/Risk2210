package com.nesler.risk.risk2210;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.nesler.risk.base.Territory;

public class TerritoryConstants {

	public enum Territories {
		AMAZON_DESERT("Amazon_Desert", 0), 
		ANDEAN_NATIONS("Andean Nations", 1), 
		ARGENTINA("Argentina", 2), 
		NUEVO_TIMOTO("Nuevo Timoto", 3);
		
		private final int index;
		private final String displayName;
		
		Territories(String displayName, int index){
			this.index = index;
			this.displayName = displayName;
		}
		
		public String getDisplayName(){
			return displayName;
		}
		
		public int getIndex(){
			return index;
		}
	}
	

	/*
	 * the following enums declare adjacent territories
	 */
	public enum AMAZON_DESERT {
		ANDEAN_NATIONS, ARGENTINA, NUEVO_TIMOTO
	}

	public enum ANDEAN_NATIONS {
		AMAZON_DESERT, ARGENTINA, NUEVO_TIMOTO
	}

	public enum ARGENTINA {
		AMAZON_DESERT, ANDEAN_NATIONS
	}

	public enum NUEVO_TIMOTO {
		AMAZON_DESERT, ANDEAN_NATIONS, ARGENTINA
	}

	/*
	 * The following string values are to be used for territory display names
	 */
	//String AMAZON_DESERT = "Amazon Desert";
	String ANDEAN_NATIONS = "Andean Nation";
	String ARGENTINA = "Argentina";
	String NUEVO_TIMOTO = "Nuevo Timoto";
	
	//Territory AMAZON_DESERT = new Territory(Territories.AMAZON_DESERT, "Amazon Desert", WorldConstants.TerritoryTypes.LAND, 0);
	
	//create object to hold initial attributes for Territories
	
	// why not just create them here?
}
