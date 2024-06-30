package com.tsnf.assignment3;

public class Continent {
	private String Continent_name;
	private int Total_country;
	public Continent() {
		super();
	}
	public Continent(String continent_name, int total_country) {
		super();
		continent_name = Continent_name;
		total_country = Total_country;
	}
	public String getContinent_name() {
		return Continent_name;
	}
	public void setContinent_name(String continent_name) {
		Continent_name = continent_name;
	}
	public int getTotal_country() {
		return Total_country;
	}
	public void setTotal_country(int total_country) {
		Total_country = total_country;
	}
	@Override
	public String toString() {
		return "Continent [Continent_name=" + Continent_name + ", Total_country=" + Total_country + "]";
	}
	
	

}
