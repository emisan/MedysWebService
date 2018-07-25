package de.medys.service;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

import javax.jws.WebService;

import de.medys.service.connectivity.ServiceInterface;

@WebService(name="HellosService",
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
		return LocalDateTime.now().format(new DateTimeFormatterBuilder().toFormatter().withLocale(Locale.getDefault()));
	}

	@Override
	public String getUserName()
	{
		return "emisan";
	}
	
}
