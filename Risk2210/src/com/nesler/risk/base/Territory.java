package com.nesler.risk.base;

public class Territory {
	
	private String displayName;
	private int numberOfArmies;
	private Type territoryType;
	private int indexNumber;
	private String owner;
	
	public enum Type {
		LAND, WATER, MOON
	}
	
	
	public Territory (String displayName, Type type, int indexNumber){
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
	
	public Type getType(){
		return territoryType;
	}

}
