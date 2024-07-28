package rafael.edu.helper;

import javax.persistence.EntityManager;

import rafael.edu.entity.Consulta;
import rafael.edu.entity.Medico;
import rafael.edu.entity.Paciente;

public class HelperConsulta {

	EntityManager em;

	public HelperConsulta(EntityManager em) {
		this.em = em;
	}

	//CREATE
	public String criarConsulta(String data, String horario, String diaSemana, int idMedico, int idPaciente) {
		try {
			Consulta consulta = new Consulta();
			Medico medico = em.find(Medico.class, idMedico);
			Paciente paciente = em.find(Paciente.class, idPaciente);
			consulta.setData(data);
			consulta.setHorario(horario);
			consulta.setDiaSemana(diaSemana);
			consulta.setMedico(medico);
			consulta.setPaciente(paciente);
			em.getTransaction().begin();
			em.persist(consulta);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return toStringConsultaCadastrada();
	}
	
	//DELETE
	public String excluirConsulta(int idConsulta) {
		try {
			Consulta consulta = em.find(Consulta.class, idConsulta);
			em.getTransaction().begin();
			em.remove(consulta);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return toStringConsultaExcluido();
	}

	// TOSTRING
	private String toStringConsultaCadastrada() {
		return "Consulta cadastrada";
	}

	private String toStringConsultaExcluido() {
		return "Consulta excluída";
	}
}
