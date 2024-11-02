package rafael.edu.helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import rafael.edu.entity.FemaleAthlete;
import rafael.edu.entity.Team;

public class FemaleAthleteHelper {

	private EntityManager em;
	private EntityManagerFactory emf;

	public FemaleAthleteHelper(EntityManager em, EntityManagerFactory emf) {
		this.em = em;
		this.emf = emf;
	}

	// CREATE
	public void createFemaleAthlete(String name, int age, String graduation, int idTeam) {
		try {
			FemaleAthlete femaleAthlete = new FemaleAthlete();
			Team team = em.find(Team.class, idTeam);
			femaleAthlete.setName(name);
			femaleAthlete.setAge(age);
			femaleAthlete.setGraduation(graduation);
			femaleAthlete.setTeam(team);
			em.getTransaction().begin();
			em.persist(femaleAthlete);
			em.getTransaction().commit();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			em.close();
			emf.close();
		}

	}

	// READ
	public void getFemaleAthlete(int idFemaleAthlete) {
		try {
			FemaleAthlete femaleAthlete = em.find(FemaleAthlete.class, idFemaleAthlete);
			System.out.println("Name: " + femaleAthlete.getName() + "\nAge: " + femaleAthlete.getAge()
					+ "\nGraduation: " + femaleAthlete.getGraduation() + "\nTeam: " + femaleAthlete.getTeam());
		} catch (Exception e) {

		} finally {
			em.close();
			emf.close();
		}
	}

	// UPDATE
	public void updateFemaleAthlete(String name, int age, String graduation, int idTeam) {
		try {
			FemaleAthlete femaleAthlete = new FemaleAthlete();
			Team team = em.find(Team.class, idTeam);
			femaleAthlete.setName(name);
			femaleAthlete.setAge(age);
			femaleAthlete.setGraduation(graduation);
			femaleAthlete.setTeam(team);
			em.getTransaction().begin();
			em.merge(femaleAthlete);
			em.getTransaction().commit();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			em.close();
			emf.close();
		}
	}

	// DELETE
	public void deleteFemaleAthlete(int idFemaleAthlete) {
		try {
			FemaleAthlete femaleAthlete = em.find(FemaleAthlete.class, idFemaleAthlete);
			em.getTransaction().begin();
			em.remove(femaleAthlete);
			em.getTransaction().commit();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			em.close();
			emf.close();

		}

	}

}
