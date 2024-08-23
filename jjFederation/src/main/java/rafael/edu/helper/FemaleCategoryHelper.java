package rafael.edu.helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class FemaleCategoryHelper {

	private EntityManager em;
	private EntityManagerFactory emf;
	
	public FemaleCategoryHelper(EntityManager em, EntityManagerFactory emf) {
		this.em = em;
		this.emf = emf;
	}
	
}
