package service;

import java.util.List;

import pojo.EmployeePojo;

public interface EmployeeService {

	
	// Read - fetch all books
	List<EmployeePojo> fetchAllRecords();

	// Create
	EmployeePojo addRecords(EmployeePojo recordPojo);
	
	// Update
	EmployeeService updateRecords(EmployeePojo recordPojo);

	// Delete
	EmployeeService deleteRecords(int bookId);

	// Read - fetch a book
	EmployeePojo fetchABook(int bookId);

	EmployeePojo updateRecord(EmployeePojo employeePojo);

	

}

