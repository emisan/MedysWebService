package de.medys.server;

import javax.ejb.Local;

@Local
public interface UserServiceBeanHome
{
	UserSeviceBean getUserServiceBean();
}
