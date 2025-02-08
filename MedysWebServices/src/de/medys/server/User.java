package de.medys.server;

import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="t_users", schema="praxisdaten")
public class User
{
	private Long id;
	private String vorname;
	private String nachname;
	private GregorianCalendar geburtstag;
	
	private List<Adresse> adressen;
	
	public User()
	{
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue
	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	@Column(name="vorname", nullable=false)
	public String getVorname()
	{
		return vorname;
	}

	public void setVorname(String vorname)
	{
		this.vorname = vorname;
	}

	@Column(name="nachname", nullable=false)
	public String getNachname()
	{
		return nachname;
	}

	public void setNachname(String nachname)
	{
		this.nachname = nachname;
	}

	@OneToMany(mappedBy="user", fetch=FetchType.LAZY)
	public List<Adresse> getAdressen()
	{
		return adressen;
	}

	public void setAdressen(List<Adresse> adressen)
	{
		this.adressen = adressen;
	}
	
	@Column(name="gebutrstag", nullable=false)
	@Temporal(TemporalType.DATE)
	public GregorianCalendar getGeburtstag()
	{
		return geburtstag;
	}

	public void setGeburtstag(GregorianCalendar geburtstag)
	{
		this.geburtstag = geburtstag;
	}
}
