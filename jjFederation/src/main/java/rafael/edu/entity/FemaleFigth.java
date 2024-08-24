package rafael.edu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FemaleFigth {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFemaleFigth;
	
	@Column
	private String time;
	
	private FemaleCategory femaleCategory;
	
	private FemaleAthlete athlete_1;
	
	private FemaleAthlete athlete_2;
}
