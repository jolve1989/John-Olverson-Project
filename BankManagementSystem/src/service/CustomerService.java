package service;

import java.util.List;

import pojo.AccountPojo;




public interface CustomerService {
	// Read - fetch all books
		List<AccountPojo> fetchAllRecords();

		// Create
		AccountPojo addRecords(AccountPojo recordPojo);
		
		// Update
		AccountPojo updateRecords(AccountPojo recordPojo);

		// Delete
		AccountPojo deleteRecords(int bookId);

		// Read - fetch a book
		AccountPojo fetchABook(int bookId);

		AccountPojo deleteRecords();

		AccountPojo fetchAllRecord();
	
}
