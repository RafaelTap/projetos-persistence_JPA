package rafael.edu.programa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import rafael.edu.helper.HelperPaciente;
import rafael.edu.query.Pesquisa;

public class ProgramaTeste {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("clinica");
		EntityManager em = emf.createEntityManager();
		
		HelperPaciente pDao = new HelperPaciente(em);
		pDao.cadastrarPaciente("201", "Marcia Guedes", "41", "36453474610");
		pDao.cadastrarPaciente("202", "Mario Pereira", "48", "36457774663");
		pDao.cadastrarPaciente("203", "Nancir Soeiro", "70", "22232948577");
		pDao.cadastrarPaciente("204", "Marcos Antônio", "55", "44001928365");
		pDao.cadastrarPaciente("205", "Reginaldo Costa", "21", "45773662153");
		pDao.cadastrarPaciente("206", "Marcia Guedes", "55", "33948666009");
		pDao.cadastrarPaciente("207", "Gabriela Bastos", "24", "00989785571");
		pDao.cadastrarPaciente("208", "Ana Luísa", "19", "11928667778");
		pDao.cadastrarPaciente("209", "Rafael Taparica", "34", "13850765776");
		pDao.cadastrarPaciente("210", "Mariana Souza", "18", "22017656643");
		
		
		//HelperMedico mDao = new HelperMedico(em);
		//mDao.cadastrarMedico("Farides Santos", "334657RJ", "Clínico Geral", "106");
		
		//HelperConsulta hDao = new HelperConsulta(em);
		//hDao.criarConsulta("26/07/24", "8-00h", "sexta-feira", 7, 6);
		
		//HelperPaciente hDao = new HelperPaciente(em);
		//hDao.obterPaciente(2);
			
		//HelperConsulta hDao = new HelperConsulta(em);
		//hDao.atualizarConsulta("29/07/24", "8-00h", "segunda-feira", 11);
		
		Pesquisa pesquisa = new Pesquisa(em);
		//pesquisa.medicoLista();
		//pesquisa.pacienteLista();
		pesquisa.consultaLista();
		
		emf.close();
		em.close();
	}
}
