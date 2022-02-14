package service;

import java.util.List;

import dao.CustomerDao;
import pojo.AccountPojo;


public class CustomerServicelmpl implements CustomerService {
  //     BankDao bankDao;
       CustomerDao customerDao;

	/**
	 * @return the customerDao
	 */
	public CustomerDao getCustomerDao() {
		return customerDao;
	}

	/**
	 * @param customerDao the customerDao to set
	 */
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public List<AccountPojo> fetchAllRecords() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountPojo addRecords(AccountPojo recordPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountPojo updateRecords(AccountPojo recordPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountPojo deleteRecords(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountPojo fetchABook(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountPojo deleteRecords() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountPojo fetchAllRecord() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}	

				
	