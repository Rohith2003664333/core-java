package com.tsnf.assignment3;

public class State extends Country {
	private String state_name;
	private String state_cm;
	public State() {
		super();
	}
	public State(String Continent_name,int Total_country,String country_name,String country_pm,String state_name, String state_cm) {
		super(Continent_name,Total_country,country_name,country_pm);
		this.state_name = state_name;
		this.state_cm = state_cm;
	}
	@Override
	public String toString() {
		return "State [state_name=" + state_name + ", state_cm=" + state_cm + ", toString()=" + super.toString()
				+ ", getCountry_name()=" + getCountry_name() + ", getCountry_pm()=" + getCountry_pm()
				+ ", getContinent_name()=" + getContinent_name() + ", getTotal_country()=" + getTotal_country()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	public String getState_name() {
		return state_name;
	}
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	public String getState_cm() {
		return state_cm;
	}
	public void setState_cm(String state_cm) {
		this.state_cm = state_cm;
	}
	

}
