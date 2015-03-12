package com.nesler.risk.risk2210;


import java.util.LinkedList;
import java.util.TreeMap;

import com.nesler.risk.base.Territory.Type;

public class TerritoryConstants {
 
	private TreeMap _adjacencyMap = new TreeMap();
	
	public enum Territories {
		AMAZON_DESERT("Amazon Desert", Type.LAND, 0), 
		ANDEAN_NATIONS("Andean Nations", Type.LAND, 1), 
		ARGENTINA("Argentina", Type.LAND, 2), 
		NUEVO_TIMOTO("Nuevo Timoto", Type.LAND, 3);

		private final int index;
		private final String displayName;
		private final Type type;
		

		Territories(String displayName, Type type, int index) {
			this.index = index;
			this.displayName = displayName;
			this.type = type;
		}

		public String getDisplayName() {
			return displayName;
		}

		public Type getType() {
			return type;
		}

		public int getIndex() {
			return index;
		}
		
	}

	
	Territories[] amazonDesert = {Territories.ANDEAN_NATIONS, Territories.ARGENTINA, Territories.NUEVO_TIMOTO};
	

	public enum ANDEAN_NATIONS {
		AMAZON_DESERT, ARGENTINA, NUEVO_TIMOTO
	}

	public enum ARGENTINA {
		AMAZON_DESERT, ANDEAN_NATIONS
	}

	public enum NUEVO_TIMOTO {
		AMAZON_DESERT, ANDEAN_NATIONS, ARGENTINA
	}

	private void setAdjacencyList(Territories nodeTerritory, Territories[] adjacentTerritories) {
		LinkedList adjacencyList = new LinkedList();
		for(Territories terr:adjacentTerritories){
			adjacencyList.add(terr.getIndex());
		}
		
		_adjacencyMap.put(nodeTerritory.getIndex(), adjacencyList);
	}
	
}
