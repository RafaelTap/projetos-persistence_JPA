package rafael.edu.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "femaleCategory")
public class FemaleCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFemaleCategory;
	
	@Column
	private String name;
	
	@Column
	private String age;
	
	@Column
	private String graduation;
	
	@Column
	private String weight;

	@OneToMany(mappedBy = "femaleCategory")
	private List<FemaleFigth> femaleFigthsList;


}
