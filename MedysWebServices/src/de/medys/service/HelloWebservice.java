package de.medys.service;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.jws.WebService;

import de.medys.service.connectivity.ServiceInterface;

@WebService(name="HelloWebService",
	serviceName="HelloWebService",
	portName="HelloWebServicePort",
	targetNamespace="http://service.medys.de",
	endpointInterface="de.medys.service.connectivity.ServiceInterface")
public class HelloWebservice implements ServiceInterface
{
	private String username;
	
	@Override
	public String sayHello()
	{
		return username != null ? "Hallo " + username : "Hallo WebService";
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
