package de.medys.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import de.medys.service.connectivity.ServiceInterface;

public class MedysWebServiceClient
{
	public static void main(String[] args) {
		
		try
		{
			URL url = new URL("http://localhost:7070/medys/HelloWebService?wsdl");
			
			QName qname = new QName("http://service.medys.de", "HelloWebService");
			
			Service service = Service.create(url, qname);
			
			ServiceInterface si = service.getPort(ServiceInterface.class);
			
			System.out.println(si.getTimeAsString());
			System.out.println(si.getUserName());
		}
		catch (MalformedURLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
