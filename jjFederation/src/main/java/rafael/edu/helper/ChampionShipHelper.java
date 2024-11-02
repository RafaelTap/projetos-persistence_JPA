package rafael.edu.helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import rafael.edu.entity.ChampionShip;

public class ChampionShipHelper {

	private EntityManager em;
	private EntityManagerFactory emf;

	public ChampionShipHelper(EntityManager em, EntityManagerFactory emf) {
		this.em = em;
		this.emf = emf;
	}

	// CREATE

	public void createChampionShip(String name, String date, String time) {
		try {
			ChampionShip championShip = new ChampionShip();
			championShip.setName(name);
			championShip.setDate(date);
			championShip.setTime(time);
			em.getTransaction().begin();
			em.persist(championShip);
			em.getTransaction().commit();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			em.close();
			emf.close();
		}
	}

	// READ
	public void getChampionShip(int idChampionShip) {
		try {
			ChampionShip championShip = em.find(ChampionShip.class, idChampionShip);
			System.out.println("ChampionShip: " + championShip.getName() + "\nTime: " + championShip.getTime()
					+ "\nDate: " + championShip.getDate());
			System.out.println();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			em.close();
			emf.close();
		}
	}

	// UPDATE
	public void upDateChampionShip(String name, String date, String time) {
		try {
			ChampionShip championShip = new ChampionShip();
			championShip.setName(name);
			championShip.setDate(date);
			championShip.setTime(time);
			em.getTransaction().begin();
			em.merge(championShip);
			em.getTransaction().commit();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			em.close();
			emf.close();
		}
	}

	public void deleteChampionShip(int idChampionShip) {
		try {
			ChampionShip championShip = em.find(ChampionShip.class, idChampionShip);
			em.getTransaction().begin();
			em.remove(championShip);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			em.close();
			emf.close();
		}
	}

}
