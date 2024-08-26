package rafael.edu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class FemaleFigth {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFemaleFigth;

	@Column
	private String time;

	@ManyToOne
	@JoinColumn(name = "femaleCategory_idFemaleCategory")
	private FemaleCategory femaleCategory;

	@OneToOne
	private FemaleAthlete athlete_1;

	@OneToOne
	private FemaleAthlete athlete_2;

	@ManyToOne
	@JoinColumn(name = "arena_idArena")
	private Arena arena;

	public int getIdFemaleFigth() {
		return idFemaleFigth;
	}

	public void setIdFemaleFigth(int idFemaleFigth) {
		this.idFemaleFigth = idFemaleFigth;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public FemaleCategory getFemaleCategory() {
		return femaleCategory;
	}

	public void setFemaleCategory(FemaleCategory femaleCategory) {
		this.femaleCategory = femaleCategory;
	}

	public FemaleAthlete getAthlete_1() {
		return athlete_1;
	}

	public void setAthlete_1(FemaleAthlete athlete_1) {
		this.athlete_1 = athlete_1;
	}

	public FemaleAthlete getAthlete_2() {
		return athlete_2;
	}

	public void setAthlete_2(FemaleAthlete athlete_2) {
		this.athlete_2 = athlete_2;
	}

	public Arena getArena() {
		return arena;
	}

	public void setArena(Arena arena) {
		this.arena = arena;
	}

}
