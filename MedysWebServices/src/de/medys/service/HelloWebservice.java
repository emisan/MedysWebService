package de.medys.service;
import java.time.LocalDateTime;

import javax.jws.WebService;

import de.medys.service.connectivity.ServiceInterface;

@WebService(name="HelloWebService",
			serviceName="HelloWebService",
			portName="HelloWebServicePort",
			targetNamespace="http://service.medys.de",
			endpointInterface="de.medys.service.connectivity.ServiceInterface")
public class HelloWebservice implements ServiceInterface
{
	public String sayHello()
	{
		return "Hello WebService";
	}
	
	public String getTimeAsString()
	{
		return LocalDateTime.now().toString();
	}

	@Override
	public String getUserName()
	{
		return "emisan";
	}
	
}
