package rafael.edu.entity;

import java.util.List;

public class Book {

	private int idBook;

	private String title;

	private String Author;

	private Section section;

	private List<Customer> customerList;
	
	private List<RentRegistration> bookRentList;
}
