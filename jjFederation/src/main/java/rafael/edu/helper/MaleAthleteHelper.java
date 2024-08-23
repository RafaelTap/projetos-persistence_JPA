package rafael.edu.helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class MaleAthleteHelper {

	private EntityManager em;
	private EntityManagerFactory emf;
	
	public MaleAthleteHelper(EntityManager em, EntityManagerFactory emf) {
		this.em = em;
		this.emf = emf;
	}
		
}
