package rafael.edu.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idBook;

	@Column
	private String title;

	@Column
	private String author;

	@ManyToOne
	private Section section;

	@ManyToMany(mappedBy = "bookList")
	private List<Customer> customerList;

	@OneToMany(mappedBy = "book")
	private List<RentRegistration> RentRegistrationList;

	public int getIdBook() {
		return idBook;
	}

	public void setIdBook(int idBook) {
		this.idBook = idBook;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public List<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}

	public List<RentRegistration> getRentRegistrationList() {
		return RentRegistrationList;
	}

	public void setRentRegistrationList(List<RentRegistration> rentRegistrationList) {
		RentRegistrationList = rentRegistrationList;
	}

}
