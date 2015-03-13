package com.nesler.risk.risk2210;


import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

import com.nesler.risk.base.Territory;
import com.nesler.risk.base.Territory.Type;

public class TerritoryConstants {
 
	private TreeMap<Integer, Territory> territoryMap = new TreeMap<Integer, Territory>();
	private TreeMap<Integer, List<Integer>> territoryAdjacencyMap = new TreeMap<Integer, List<Integer>>();
	

	public enum Territories {
		AMAZON_DESERT("Amazon Desert", Type.LAND, 0), 
		ANDEAN_NATIONS("Andean Nations", Type.LAND, 1), 
		ARGENTINA("Argentina", Type.LAND, 2), 
		NUEVO_TIMOTO("Nuevo Timoto", Type.LAND, 3);

		private final String displayName;
		private final Type type;
		private final int index;
		

		Territories(String displayName, Type type, int index) {
			this.displayName = displayName;
			this.type = type;
			this.index = index;
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
	
	// Below declares the adjacent territories for each territory. Names should be camelcased without underscores
	// to aid in the creation of the adjacency list.
	Territories[] amazonDesert = {Territories.ANDEAN_NATIONS, Territories.ARGENTINA, Territories.NUEVO_TIMOTO};
	Territories[] andeanNations = {Territories.AMAZON_DESERT, Territories.ARGENTINA, Territories.NUEVO_TIMOTO};
	Territories[] argentina = {Territories.AMAZON_DESERT, Territories.ANDEAN_NATIONS};
	Territories[] nuevoTimoto = {Territories.AMAZON_DESERT, Territories.ANDEAN_NATIONS, Territories.ARGENTINA};
	
	/**
	 * To be called when the game is created. Creates all territories and defines their adjacent territories in
	 * an adjacency map. After this is called, get_territoryMap and getTerritoryAdjacencyMap should be called
	 * to retrieve these elements. 
	 */
	public void initialize(){
		initializeTerritories();
		initializeAdjacencyList();
	}
	
	public TreeMap<Integer, Territory> get_territoryMap() {
		return territoryMap;
	}
	
	public TreeMap<Integer, List<Integer>> get_territoryAdjacencyMap(){
		return territoryAdjacencyMap;
	}
	
	
	/**
	 * populates the territoryMap using the Territories defined in 'Territories' enum with Key=Index number and Value=Territory.
	 */
	private void initializeTerritories(){
		for(Territories territory:Territories.values()){
			territoryMap.put(territory.getIndex(), new Territory(territory.getDisplayName(), territory.getType(), territory.getIndex()));
		}
	}
	
	/**
	 * used by the initialize function to populate the Territory Adjacency Map used to
	 * determine if two territories are adjacent to one another.
	 */
	private void initializeAdjacencyList(){
		setAdjacencyList(Territories.AMAZON_DESERT, amazonDesert);
		setAdjacencyList(Territories.ANDEAN_NATIONS, andeanNations);
		setAdjacencyList(Territories.ARGENTINA, argentina);
		setAdjacencyList(Territories.NUEVO_TIMOTO, nuevoTimoto);
	}

	/**
	 * Used by the initializeAdjacencyList function. Adds to the adjacencyMap where the Key is the index of the node territory
	 * and the Value is a LinkedList of adjacent territory index values.
	 * 
	 * @param nodeTerritory The Territory that all territories in the AdjacentTerritories array are adjacent to. This will be the Key.
	 * @param adjacentTerritories a Territories array consisting of the adjacent territories to the node territory. This we be the Value.
	 */
	private void setAdjacencyList(Territories nodeTerritory, Territories[] adjacentTerritories) {
		List<Integer> adjacencyList = new LinkedList<Integer>();
		for(Territories terr:adjacentTerritories){
			adjacencyList.add(terr.getIndex());
		}
		
		territoryAdjacencyMap.put(nodeTerritory.getIndex(), adjacencyList);
	}
	
	
}
