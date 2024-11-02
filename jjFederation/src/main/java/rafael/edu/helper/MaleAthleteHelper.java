package rafael.edu.helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import rafael.edu.entity.MaleAthlete;
import rafael.edu.entity.Team;

public class MaleAthleteHelper {

	private EntityManager em;
	private EntityManagerFactory emf;

	public MaleAthleteHelper(EntityManager em, EntityManagerFactory emf) {
		this.em = em;
		this.emf = emf;
	}

	// CREAT
	public void createMaleAthlete(String name, int age, String graduation, int idTeam) {

		try {
			MaleAthlete maleAthlete = new MaleAthlete();
			Team team = em.find(Team.class, idTeam);
			maleAthlete.setName(name);
			maleAthlete.setAge(age);
			maleAthlete.setGraduation(graduation);
			maleAthlete.setTeam(team);
			em.getTransaction().begin();
			em.persist(team);
			em.getTransaction().commit();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			em.close();
			em.close();

		}
	}

	// READ
	public void getMaleAthlete(int idMaleAthlete) {
		try {
			MaleAthlete maleAthlete = em.find(MaleAthlete.class, idMaleAthlete);
			System.out.println("Name: " + maleAthlete.getName() + "\nAge: " + maleAthlete.getAge() + "\nGraduation: "
					+ maleAthlete.getGraduation() + "\nTeam: " + maleAthlete.getTeam());

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			em.close();
			emf.close();
		}
	}

	// UPDATE
	public void upDateMaleAthlete(String name, int age, String graduation, int idTeam) {
		try {
			MaleAthlete maleAthlete = new MaleAthlete();
			Team team = em.find(Team.class, idTeam);
			maleAthlete.setName(name);
			maleAthlete.setAge(age);
			maleAthlete.setGraduation(graduation);
			maleAthlete.setTeam(team);
			em.getTransaction().begin();
			em.merge(maleAthlete);
			em.getTransaction().commit();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			em.close();
			emf.close();
		}
	}

	// DELETE
	public void deleteMaleAthlete(int idMaleAthlete) {
		try {
			MaleAthlete maleAthlete = em.find(MaleAthlete.class, idMaleAthlete);
			em.getTransaction().begin();
			em.remove(maleAthlete);
			em.getTransaction().commit();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			em.close();
			emf.close();

		}
	}
}
