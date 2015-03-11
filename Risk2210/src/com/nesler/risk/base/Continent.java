package com.nesler.risk.base;

public class Continent {
	
	private String continentName;
	private int bonus;
	
	
	public Continent(String name, int bonus){
		this.continentName = name;
		this.bonus = bonus;
	}
	
	public String getContinentName(){
		return continentName;
	}
	
	public int getBonus(){
		return bonus;
	}

}
