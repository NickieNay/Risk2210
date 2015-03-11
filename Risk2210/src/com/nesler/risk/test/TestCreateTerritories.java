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
		// TODO Auto-generated method stub
		
		TreeMap territoryMap = new TreeMap();
		for(Territories territory:Territories.values()){
			territoryMap.put(territory.getIndex(), new Territory(territory.getDisplayName(), territory.getType(), territory.getIndex()));
		}
		
		Set set = territoryMap.entrySet();
		Iterator iterator = set.iterator();
		
		while (iterator.hasNext()){
			Map.Entry me = (Map.Entry) iterator.next();
			System.out.print(me.getKey() + ": ");
			Territory terr = (Territory) me.getValue();
	        System.out.println(terr.getDisplayName() + " of type " + terr.getType() + " has " + terr.getNumberofArmies() + " armies");
		}

	}

}
