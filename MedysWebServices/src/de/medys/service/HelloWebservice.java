package de.medys.service;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.jws.WebService;

import de.medys.service.connectivity.ServiceInterface;

@WebService(endpointInterface="de.medys.service.connectivity.ServiceInterface")
public class HelloWebservice implements ServiceInterface
{
	private String username;
	
	@Override
	public String sayHello()
	{
		return "Hello WebService";
	}
	
	@Override
	public String getTimeAsString()
	{
		return LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()).toString();
	}

	@Override
	public String getUserName()
	{
		return username != null ? username: "Es existiert kein User!";
	}

	@Override
	public void setUserName(String name)
	{
		username = name;
	}
	
}
