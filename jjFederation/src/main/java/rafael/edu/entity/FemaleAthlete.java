package rafael.edu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FemaleAthlete {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFemaleAthlete;

	@Column
	private String name;

	@Column
	private int age;

	@Column
	private String graduation;

	private TeamLeader teamLeader;

	private Team team;

}
