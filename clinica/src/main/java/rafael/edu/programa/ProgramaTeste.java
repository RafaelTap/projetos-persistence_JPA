package rafael.edu.programa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import rafael.edu.helper.HelperConsulta;

public class ProgramaTeste {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("clinica");
		EntityManager em = emf.createEntityManager();
		
		//HelperPaciente pDao = new HelperPaciente(em);
		//pDao.cadastrarPaciente("207", "Marcia Guedes", "41", "36453474610");
		
		//HelperMedico mDao = new HelperMedico(em);
		//mDao.cadastrarMedico("Farides Santos", "334657RJ", "Clínico Geral", "106");
		
		HelperConsulta hDao = new HelperConsulta(em);
		hDao.criarConsulta("26/07/24", "8-00h", "sexta-feira", 7, 6);
				
		
		emf.close();
		em.close();
	}
}
