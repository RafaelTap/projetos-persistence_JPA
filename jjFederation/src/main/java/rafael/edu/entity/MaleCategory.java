package rafael.edu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MaleCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCategory;
	
	@Column
	private String name;
	
	@Column
	private String age;
	
	@Column
	private String graduation;
	
	@Column
	private String weight;
	
	private MaleFigth maleFigth;
	

}
