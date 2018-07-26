package de.medys.service.connectivity;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface ServiceInterface
{
	@WebMethod
	String sayHello();
	
	@WebMethod
	String getTimeAsString();
	
	@WebMethod
	void setUserName(@WebParam String name);
	
	@WebMethod
	String getUserName();
}
