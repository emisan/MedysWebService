package de.medys.server;

import java.util.GregorianCalendar;

import javax.ejb.Remote;

@Remote
public interface UserServiceBeanRemote
{
	void legeBenutzerAn(String vorname, String nachname, GregorianCalendar geburstag);
	User gibBenutzer(Long id);
}
