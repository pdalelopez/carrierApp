package com.example.carrierApp.Models;

import javax.persistence.Entity;

@Entity
public class Crew extends Person
{

	String rank;
	boolean isInjured;
	
	public Crew()
	{
	}
	
	public String getRank()
	{
		return rank;
	}
	public void setRank(String rank)
	{
		this.rank = rank;
	}
	public boolean isInjured()
	{
		return isInjured;
	}
	public void setInjured(boolean isInjured)
	{
		this.isInjured = isInjured;
	}
	
	
}
