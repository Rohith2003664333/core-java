package com.tsnf.assignment3;

public class Country extends Continent {
	private String country_name;
	private String country_pm;
	public Country() {
		super();
	}
	
	public Country(String Continent_name,int Total_country,String country_name, String country_pm) {
		super(Continent_name,Total_country);
		this.country_name = country_name;
		this.country_pm = country_pm;
	}
	

	@Override
	public String toString() {
		return "Country [country_name=" + country_name + ", country_pm=" + country_pm + ", getContinent_name()="
				+ getContinent_name() + ", getTotal_country()=" + getTotal_country() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public String getCountry_pm() {
		return country_pm;
	}

	public void setCountry_pm(String country_pm) {
		this.country_pm = country_pm;
	}

	
	
	
}
