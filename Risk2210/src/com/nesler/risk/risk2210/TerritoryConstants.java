package com.nesler.risk.risk2210;

public class TerritoryConstants {

	public enum Territories {
		AMAZON_DESERT, ANDEAN_NATIONS, ARGENTINA, NUEVO_TIMOTO
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
	String AMAZON_DESERT = "Amazon Desert";
	String ANDEAN_NATIONS = "Andean Nation";
	String ARGENTINA = "Argentina";
	String NUEVO_TIMOTO = "Nuevo Timoto";

}
