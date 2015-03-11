package com.nesler.risk.risk2210;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.nesler.risk.base.Territory;
import com.nesler.risk.base.Territory.Type;

public class TerritoryConstants {

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

}
