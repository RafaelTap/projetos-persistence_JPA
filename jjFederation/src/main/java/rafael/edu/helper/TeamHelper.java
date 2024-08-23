package rafael.edu.helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class TeamHelper {

	private EntityManager em;
	private EntityManagerFactory emf;
	
	public TeamHelper(EntityManager em, EntityManagerFactory emf) {
		this.em = em;
		this.emf = emf;
	}
	
	
}
