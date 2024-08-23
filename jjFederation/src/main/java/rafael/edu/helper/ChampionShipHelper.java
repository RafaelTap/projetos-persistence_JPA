package rafael.edu.helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class ChampionShipHelper {

	private EntityManager em;
	private EntityManagerFactory emf;
	
	public ChampionShipHelper(EntityManager em, EntityManagerFactory emf) {
		this.em = em;
		this.emf = emf;
	}
	
}
