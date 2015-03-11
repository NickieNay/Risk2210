package com.nesler.risk.base;

public class Territory {
	
	private String territoryName;
	private String displayName;
	private int numberOfArmies;
	private String territoryType;
	private int indexNumber;
	private String owner;
	
	
	
	public Territory (String internalName, String displayName, String type, int indexNumber){
		this.territoryName = internalName;
		this.displayName = displayName;
		this.territoryType = type;
		this.indexNumber = indexNumber;
		this.numberOfArmies = 0;
	}
	
	public void addArmies(int armies){
		this.numberOfArmies += armies;
	}
	
	public void removeArmies(int armies){
		this.numberOfArmies -= armies;
	}
	
	public int getNumberofArmies(){
		return numberOfArmies;
	}
	
	public void setOwner(String newOwner){
		this.owner = newOwner;
	}
	
	public String getOwner(){
		return owner;
	}
	
	public int getIndexNumber(){
		return indexNumber;
	}
	
	public String getDisplayName(){
		return displayName;
	}
	
	public String getType(){
		return territoryType;
	}

}
