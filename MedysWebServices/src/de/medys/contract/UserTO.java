package de.medys.contract;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import de.medys.server.Adresse;

public class UserTO implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String vorname;
	private String nachname;
	private LocalDate geburtstag;
	
	private List<Adresse> adressen;
	
	public UserTO()
	{
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getVorname()
	{
		return vorname;
	}

	public void setVorname(String vorname)
	{
		this.vorname = vorname;
	}

	public String getNachname()
	{
		return nachname;
	}

	public void setNachname(String nachname)
	{
		this.nachname = nachname;
	}

	public LocalDate getGeburtstag()
	{
		return geburtstag;
	}

	public void setGeburtstag(LocalDate geburtstag)
	{
		this.geburtstag = geburtstag;
	}

	public List<Adresse> getAdressen()
	{
		return adressen;
	}

	public void setAdressen(List<Adresse> adressen)
	{
		this.adressen = adressen;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}
	
	
}
