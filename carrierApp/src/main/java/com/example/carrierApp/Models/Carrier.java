package com.example.carrierApp.Models;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Carrier
{
	@Id
	UUID id;
	String name;
	String Class;
	//List<Crew> crewList;
	//List<Plane> planeList;
	
	public Carrier()
	{
	}

	public UUID getId()
	{
		return id;
	}

	public void setId(UUID id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	/*public List<Crew> getCrewList()
	{
		return crewList;
	}

	public void setCrewList(List<Crew> crewList)
	{
		this.crewList = crewList;
	}

	public List<Plane> getPlaneList()
	{
		return planeList;
	}

	public void setPlaneList(List<Plane> planeList)
	{
		this.planeList = planeList;
	}*/
	
}
