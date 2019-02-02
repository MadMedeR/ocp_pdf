package fragen_101_End;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import fragen_101_End.Country.Continent;

class Country {
	public enum Continent {EUROPE, ASIA}
	
	String name;
	Continent region;
	
	public Country (String na, Continent reg) {
		name = na; region = reg;
	}

	public String getName () {return name;}
	public Continent getRegion () {return region;}
}

public class _106 {
	public static void main(String[] args) {
		List<Country> couList = Arrays.asList (
				new Country ("Japan", Country.Continent.ASIA),
				new Country ("Italy", Country.Continent.EUROPE),
				new Country ("Germany", Country.Continent.EUROPE)
		);
		Map<Continent, List<String>> regionNames =
				couList.stream().collect(Collectors.groupingBy(Country::getRegion,Collectors.mapping(Country::getName, Collectors.toList())));
		System.out.println(regionNames);
	}
}


/*
	What is the output?
	
	A. {EUROPE = [Italy, Germany], ASIA = [Japan]}
	B. {ASIA = [Japan], EUROPE = [Italy, Germany]}
	C. {EUROPE = [Germany, Italy], ASIA = [Japan]}
	D. {EUROPE = [Germany], EUROPE = [Italy], ASIA = [Japan]}

	Answer: A
 */
// 