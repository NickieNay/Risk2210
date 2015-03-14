package com.nesler.risk.test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.nesler.risk.base.Territory;
import com.nesler.risk.risk2210.TerritoryConstants;

public class TestTerritoryInitialization {

	public static void main(String[] args) {
		final long startTime = System.nanoTime();
		final long endTime;
		final float endTimeSeconds;

		TerritoryConstants terrconst = new TerritoryConstants();
		
		terrconst.initialize();
		
		TreeMap<Integer, Territory> territoryMap = terrconst.get_territoryMap();
		TreeMap<Integer, List<Integer>> adjacencyMap = terrconst.get_territoryAdjacencyMap();
		
		Set set = territoryMap.entrySet();
		Iterator iterator = set.iterator();
		
		// Retrieve the Key and Value from the hash map and 
		// print display name, territory type and number of armies on territory.
		while (iterator.hasNext()) {
			Map.Entry indexTerritoryPair = (Map.Entry) iterator.next();
			Territory terr = (Territory) indexTerritoryPair.getValue();

			System.out.print(indexTerritoryPair.getKey() + ": ");
	        System.out.println(terr.getDisplayName() + " of type " + 
	        					terr.getType() + " has " + 
	        					terr.getNumberofArmies() + " armies");
	        
	        // Print all adjacent territories for this territory
	        List<Integer> adjIndexList = adjacencyMap.get(indexTerritoryPair.getKey());
	        for(Integer adjTerrIndex:adjIndexList){
	        	Territory adjacentTerr = territoryMap.get(adjTerrIndex);
	        System.out.println(terr.getDisplayName() + "is adjacent to " + adjacentTerr.getDisplayName());
	        }
		}
		endTime = System.nanoTime() - startTime;
		endTimeSeconds = (float) endTime / 1000000000;
		System.out.println("\nThis test took:  " + endTime + "ns  (" + endTimeSeconds + "s)");
	}

}
