package de.medys.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.annotation.ManagedBean;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import de.medys.service.connectivity.ServiceInterface;

@ManagedBean(value="medysWebServiceClient")
public class MedysWebServiceClient
{
	private Service service;
	private ServiceInterface helloWebServiceInterface;
	
	public MedysWebServiceClient()
	{
		try
		{
			URL url = new URL("http://localhost:7070/medys/HelloWebService?wsdl");
			
			QName qname = new QName("http://service.medys.de", "HelloWebService");
			
			service = Service.create(url, qname);
			
			helloWebServiceInterface = service.getPort(ServiceInterface.class);
		}
		catch (MalformedURLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setzeUsername(String username)
	{
		if(helloWebServiceInterface != null && username != null)
		{
			helloWebServiceInterface.setUserName(username);
		}
	}
	
	public String gibUsername()
	{
		return helloWebServiceInterface != null ? helloWebServiceInterface.getUserName() : "WebService Schnittstelle \"HelloWebService\" ist NULL!";
	}
	
	public String sagHallo()
	{
		String s = null;
		if(helloWebServiceInterface != null)
		{
			s = helloWebServiceInterface.sayHello();
		}
		return s;
	}
	
	public String gibAktuelleZeit()
	{
		String zeit = null;
		
		if(helloWebServiceInterface != null)
		{
			zeit = helloWebServiceInterface.getTimeAsString();
		}
		return zeit;
	}
	public static void main(String[] args) {
		new MedysWebServiceClient();
	}
}
