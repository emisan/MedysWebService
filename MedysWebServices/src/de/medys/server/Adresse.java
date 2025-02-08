package de.medys.server;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_user_adresse", schema="praxisdaten")
public class Adresse
{
	private Long id;
	
	private String strasse;
	private String hausnr;
	private String plz;
	private String ort;
	private User user;
	
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
	
	@Column(name="strasse")
	public String getStrasse()
	{
		return strasse;
	}
	public void setStrasse(String strasse)
	{
		this.strasse = strasse;
	}
	
	@Column(name="hausnr")
	public String getHausnr()
	{
		return hausnr;
	}
	public void setHausnr(String hausnr)
	{
		this.hausnr = hausnr;
	}
	
	@Column(name="plz")
	public String getPlz()
	{
		return plz;
	}
	public void setPlz(String plz)
	{
		this.plz = plz;
	}
	
	@Column(name="ort")
	public String getOrt()
	{
		return ort;
	}
	public void setOrt(String ort)
	{
		this.ort = ort;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_user")
	public User getUser()
	{
		return user;
	}
	public void setUser(User user)
	{
		this.user = user;
	}
	
	
}
