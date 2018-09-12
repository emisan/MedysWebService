package de.medys.server;

import java.io.Serializable;
import java.util.GregorianCalendar;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

/**
 * Entity implementation class for Entity: UserSeviceBean
 *
 */
@Stateless
@Local(value=UserServiceBeanHome.class)
@Remote(value=UserServiceBeanRemote.class)
public class UserSeviceBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext
	private EntityManager entityManager;
	
	@PersistenceUnit(name="MedysWebServicesEntityManager")
	private EntityManagerFactory emf;
	
	public UserSeviceBean() {
		
		emf = Persistence.createEntityManagerFactory("MedysWebServicesEntityManager");
		entityManager = emf.createEntityManager();
	}
	
	public void legeBenutzerAn(String vorname, String nachname, GregorianCalendar geburstag)
	{
		EntityTransaction transaction = entityManager.getTransaction();
		
		try
		{
			transaction.begin();
			User user = new User();
			user.setVorname(vorname);
			user.setNachname(nachname);
			user.setGeburtstag(geburstag);
			entityManager.persist(user);
			transaction.commit();
		}
		catch(Exception e)
		{
			if(transaction.isActive())
			{
				transaction.rollback();
			}
			else
			{
				e.printStackTrace();
			}
		}
	}
	
	protected User gibBenutzer(Long id)
	{
		return entityManager.find(User.class, id);
	}
}
