package de.medys.service.connectivity;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface ServiceInterface
{
	@WebMethod(action="sayhello")
	String sayHello();
	
	@WebMethod(action="gettime")
	String getTimeAsString();
	
	@WebMethod(action="username")
	String getUserName();
}
