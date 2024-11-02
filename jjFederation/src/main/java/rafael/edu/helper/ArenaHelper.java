package rafael.edu.helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import rafael.edu.entity.Arena;

public class ArenaHelper {

	private EntityManager em;
	private EntityManagerFactory emf;

	public ArenaHelper(EntityManager em, EntityManagerFactory emf) {
		this.em = em;
		this.emf = emf;
	}

	// CREATE
	public void createArena(int arenaNumber) {
		try {
			Arena arena = new Arena();
			em.getTransaction().begin();
			arena.setArenaNumber(arenaNumber);
			em.persist(arena);
			em.getTransaction().commit();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			em.close();
			emf.close();
		}

	}

	// READ
	public void getArena(int idArena) {
		try {
			Arena arena = em.find(Arena.class, idArena);
			System.out.println("Arena: #" + arena.getArenaNumber());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
		}
	}

	// DELETE
	public void deleteArena(int idArena) {
		try {
			Arena arena = em.find(Arena.class, idArena);
			em.getTransaction().begin();
			arena.setIdArena(idArena);
			em.remove(arena);
			em.getTransaction().commit();
			;
		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			em.close();
			emf.close();
		}

	}

}
