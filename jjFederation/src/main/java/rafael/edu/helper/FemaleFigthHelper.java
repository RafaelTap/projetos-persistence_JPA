package rafael.edu.helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class FemaleFigthHelper {

	private EntityManager em;
	private EntityManagerFactory emf;
	
	public FemaleFigthHelper(EntityManager em, EntityManagerFactory emf) {
		this.em = em;
		this.emf = emf;
	}
	
}
