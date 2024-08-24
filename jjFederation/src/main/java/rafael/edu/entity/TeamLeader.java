package rafael.edu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TeamLeader {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTeamLead;

	private FemaleAthlete femaleTeamLeader = null;
	
	private MaleAthlete maleTeamLeader = null;

}
