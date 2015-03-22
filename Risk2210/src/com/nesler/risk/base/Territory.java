package com.nesler.risk.base;

import java.io.IOException;
import java.util.LinkedList;
import java.util.TreeMap;

import com.nesler.risk.risk2210.TerritoryConstants.Territories;

public class Territory {

	private final String displayName;
	private final String territoryType;
	private final int indexNumber;

	private int numberOfArmies;
	private String owner;

	
	public Territory(String displayName, String type, int indexNumber) throws IOException {
		
		
		switch (type.toLowerCase()) {
		case "land":
			territoryType = "land";
			break;
		case "water":
			territoryType = "water";
			break;
		case "moon":
			territoryType = "moon";
			break;
		default:
			throw new IOException("Territory Type mismatch. Accepted types are \"land\", \"water\", and \"moon\"");
		}

		this.displayName = displayName;
		this.indexNumber = indexNumber;
		this.numberOfArmies = 0;
	}

	public void addArmies(int armies) {
		this.numberOfArmies += armies;
	}

	public void removeArmies(int armies) {
		this.numberOfArmies -= armies;

		// if (numberOfArmies == 0){
		// this.owner = null;
		// }
	}

	public int getNumberofArmies() {
		return numberOfArmies;
	}

	public void setOwner(String newOwner) {
		this.owner = newOwner;
	}

	public String getOwner() {
		return owner;
	}

	public int getIndexNumber() {
		return indexNumber;
	}

	public String getDisplayName() {
		return displayName;
	}

	public String getType() {
		return territoryType;
	}

}
