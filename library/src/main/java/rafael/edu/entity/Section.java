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
@Table(name = "section")
public class Section {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSection;

	@Column
	private String sectionName;

	@Column
	private int number;

	@OneToMany(mappedBy = "section")
	private List<Book> bookList;

	public int getIdSection() {
		return idSection;
	}

	public void setIdSection(int idSection) {
		this.idSection = idSection;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

}
