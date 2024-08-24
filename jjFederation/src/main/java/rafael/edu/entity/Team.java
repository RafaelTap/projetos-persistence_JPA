package rafael.edu.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTeam;
	
	@Column
	private String name;
	
	
	private MaleAthlete teamLeader;
	
	private List<FemaleAthlete> femaleAthletesList;
	
	private List<MaleAthlete> maleAthletesList;
}
