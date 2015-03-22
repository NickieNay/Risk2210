package com.nesler.risk.test;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.EnumSet;

public class StringVsIntTest {
	
	enum Countries {
		 AFGHANISTAN,
		 ALBANIA,
		 ALGERIA,
		 ANDORRA,
		 ANGOLA,
		 ARGENTINA,
		 ARMENIA,
		 AUSTRALIA,
		 AUSTRIA,
		 AZERBAIJAN,
		 HONDURAS,
		 HUNGARY,
		 ICELAND,
		 IRAN,
		 IRAQ,
		 IRELAND,
		 ISRAEL,
		 ITALY,
		 ROMANIA,
		 RUSSIA,
		 AFGHANISTAN_1,
		 ALBANIA_1,
		 ALGERIA_1,
		 ANDORRA_1,
		 ANGOLA_1,
		 ARGENTINA_1,
		 ARMENIA_1,
		 AUSTRALIA_1,
		 AUSTRIA_1,
		 AZERBAIJAN_1,
		 HONDURAS_1,
		 HUNGARY_1,
		 ICELAND_1,
		 IRAN_1,
		 IRAQ_1,
		 IRELAND_1,
		 ISRAEL_1,
		 ITALY_1,
		 ROMANIA_1,
		 RUSSIA_1,
	}

	/**
	 * This test declares two TreeMaps, one with strings and one with integers, to evaluate the 
	 * difference in speed when doing an iterative search.
	 * This test concludes that, for 20 elements, the Integer TreeMap takes roughly 30% less time
	 * to evaluate the search. 
	 * 
	 * This test should be extended to verify if this is a linear or exponential speed difference when the Maps
	 * are much larger.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> stringList = new LinkedList<String>();
		LinkedList<Integer> intList = new LinkedList<Integer>();
		final long startTimeString;
		final long endTimeString;
		final long startTimeInt;
		final long endTimeInt;
		final long startTimeEnum;
		final long endTimeEnum;
		
		TreeMap<String, LinkedList<String>> stringMap = new TreeMap<String, LinkedList<String>>();
		TreeMap<Integer, LinkedList<Integer>> intMap = new TreeMap<Integer, LinkedList<Integer>>();
		
		EnumSet<Countries> enumeratedSet = EnumSet.range(Countries.AFGHANISTAN, Countries.RUSSIA_1);
		EnumMap<Countries, EnumSet<Countries>> enumeratedMap = new EnumMap<>(Countries.class);
		for(Countries country:enumeratedSet){
			enumeratedMap.put(country, enumeratedSet);
		}
		
		
		
		stringList.add("Afghanistan");
		stringList.add("Albania");
		stringList.add("Algeria");
		stringList.add("Andorra");
		stringList.add("Angola");
		stringList.add("Argentina");
		stringList.add("Armenia");
		stringList.add("Australia");
		stringList.add("Austria");
		stringList.add("Azerbaijan");
		stringList.add("Honduras");
		stringList.add("Hungary");
		stringList.add("Iceland");
		stringList.add("Iran");
		stringList.add("Iraq");
		stringList.add("Ireland");
		stringList.add("Israel");
		stringList.add("Italy");
		stringList.add("Romania");
		stringList.add("Russia");
		stringList.add("Afghanistan_1");
		stringList.add("Albania_1");
		stringList.add("Algeria_1");
		stringList.add("Andorra_1");
		stringList.add("Angola_1");
		stringList.add("Argentina_1");
		stringList.add("Armenia_1");
		stringList.add("Australia_1");
		stringList.add("Austria_1");
		stringList.add("Azerbaijan_1");
		stringList.add("Honduras_1");
		stringList.add("Hungary_1");
		stringList.add("Iceland_1");
		stringList.add("Iran_1");
		stringList.add("Iraq_1");
		stringList.add("Ireland_1");
		stringList.add("Israel_1");
		stringList.add("Italy_1");
		stringList.add("Romania_1");
		stringList.add("Russia_1");
		
		intList.add(0);
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		intList.add(7);
		intList.add(8);
		intList.add(9);
		intList.add(10);
		intList.add(11);
		intList.add(12);
		intList.add(13);
		intList.add(14);
		intList.add(15);
		intList.add(16);
		intList.add(17);
		intList.add(18);
		intList.add(19);
		intList.add(20);
		intList.add(21);
		intList.add(22);
		intList.add(23);
		intList.add(24);
		intList.add(25);
		intList.add(26);
		intList.add(27);
		intList.add(28);
		intList.add(29);
		intList.add(30);
		intList.add(31);
		intList.add(32);
		intList.add(33);
		intList.add(34);
		intList.add(35);
		intList.add(36);
		intList.add(37);
		intList.add(38);
		intList.add(39);
		
		// populate StringMap
		for(String country:stringList){
			stringMap.put(country, stringList);
		}

		// populate IntegerMap
		for(Integer integer:intList){
			intMap.put(integer, intList);
		}
		
		Set stringSet = stringMap.keySet();
		Iterator iterator = stringSet.iterator();
		String keyString = (String) iterator.next();
		
		/*
		 * The following iterations work like this:
		 * search map entry 0 for key 1
		 * set the next map entry to entry of key 1
		 * search map entry 1 for key 2
		 * set the next map entry to entry of key 2
		 * etc.
		 * 
		 * In order to purely evaluate the iteration, there aren't any println's
		 * This test should be evaluated in debugger mode and stepped through to determine
		 * it works as planned.
		 */
		
		// String search
		startTimeString = System.nanoTime();
		
		while(iterator.hasNext()){
			String searchString = (String) iterator.next();
			
			LinkedList<String> searchList = stringMap.get(keyString);
			searchList.contains(searchString);
			
			keyString = searchString;
		}
		 endTimeString = System.nanoTime() - startTimeString;
		
		 
		
		Set intSet = intMap.keySet();
		iterator = intSet.iterator();
		Integer keyInteger = (Integer) iterator.next();
		
		
		// Integer search
		startTimeInt = System.nanoTime();
		
		while(iterator.hasNext()){
			Integer searchInteger = (Integer) iterator.next();
			
			LinkedList<Integer> searchList = intMap.get(keyInteger);
			searchList.contains(searchInteger);
			
			keyInteger = searchInteger;
		}
		endTimeInt = System.nanoTime() - startTimeInt;
		
		
		
		
		Set enumSet = enumeratedMap.keySet();
		iterator = enumSet.iterator();
		Countries keyEnum = (Countries) iterator.next();
		// Enum Search
		startTimeEnum = System.nanoTime();
		
		while (iterator.hasNext()){
			Countries searchCountry = (Countries) iterator.next();
			
			Set<Countries> searchSet = enumeratedMap.get(keyEnum);
			searchSet.contains(searchCountry);
			
			keyEnum = searchCountry;
			
		}
		endTimeEnum = System.nanoTime() - startTimeEnum;
		
		// print results
		System.out.println("String search took:  " + endTimeString + "ns");
		System.out.println("Integer search took:  " + endTimeInt + "ns");
		System.out.println("Enum search took:  " + endTimeEnum + "ns");

	}

}
