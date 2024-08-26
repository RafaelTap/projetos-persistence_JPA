package rafael.edu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "maleFigth")
public class MaleFigth {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMaleFigth;
	
	@Column
	private String time;
	
	@ManyToOne
	@JoinColumn(name = "maleCategory_idMaleCategory")
	private MaleCategory maleCategory;
	
	@OneToOne
	private MaleAthlete athlete_1;
	
	@OneToOne
	private MaleAthlete athlete_2;
	
	@ManyToOne
	@JoinColumn(name = "arena_idArena")
	private Arena arena;

	public int getIdMaleFigth() {
		return idMaleFigth;
	}

	public void setIdMaleFigth(int idMaleFigth) {
		this.idMaleFigth = idMaleFigth;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public MaleCategory getMaleCategory() {
		return maleCategory;
	}

	public void setMaleCategory(MaleCategory maleCategory) {
		this.maleCategory = maleCategory;
	}

	public MaleAthlete getAthlete_1() {
		return athlete_1;
	}

	public void setAthlete_1(MaleAthlete athlete_1) {
		this.athlete_1 = athlete_1;
	}

	public MaleAthlete getAthlete_2() {
		return athlete_2;
	}

	public void setAthlete_2(MaleAthlete athlete_2) {
		this.athlete_2 = athlete_2;
	}

	public Arena getArena() {
		return arena;
	}

	public void setArena(Arena arena) {
		this.arena = arena;
	}
	
}
