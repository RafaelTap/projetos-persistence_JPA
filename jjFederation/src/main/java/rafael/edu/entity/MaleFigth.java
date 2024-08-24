package rafael.edu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MaleFigth {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMaleFigth;
	
	@Column
	private String time;
	
	private MaleCategory maleCategory;
	
	private MaleAthlete athlete_1;
	
	private MaleAthlete athlete_2;
}
