package rafael.edu.helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class FemaleAthleteHelper {

	private EntityManager em;
	private EntityManagerFactory emf;
	
	public FemaleAthleteHelper(EntityManager em, EntityManagerFactory emf) {
		this.em = em;
		this.emf = emf;
	}
	
}
