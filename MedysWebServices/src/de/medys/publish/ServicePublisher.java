package de.medys.publish;

import javax.xml.ws.Endpoint;

import de.medys.service.HelloWebservice;

public class ServicePublisher
{
	public static void main(String[] args)
	{
		Endpoint.publish("http://127.0.0.1:7070/medyswebservice", new HelloWebservice());
	}
}
