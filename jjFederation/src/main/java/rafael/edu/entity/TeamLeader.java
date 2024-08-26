package rafael.edu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class TeamLeader {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTeamLead;

	@OneToOne
	private Team team;
	
	@OneToOne
	private FemaleAthlete femaleTeamLeader = null;
	
	@OneToOne
	private MaleAthlete maleTeamLeader = null;

	public int getIdTeamLead() {
		return idTeamLead;
	}

	public void setIdTeamLead(int idTeamLead) {
		this.idTeamLead = idTeamLead;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public FemaleAthlete getFemaleTeamLeader() {
		return femaleTeamLeader;
	}

	public void setFemaleTeamLeader(FemaleAthlete femaleTeamLeader) {
		this.femaleTeamLeader = femaleTeamLeader;
	}

	public MaleAthlete getMaleTeamLeader() {
		return maleTeamLeader;
	}

	public void setMaleTeamLeader(MaleAthlete maleTeamLeader) {
		this.maleTeamLeader = maleTeamLeader;
	}

}
