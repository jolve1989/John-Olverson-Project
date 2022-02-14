package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import pojo.AccountPojo;

import pojo.EmployeePojo;
import dao.CustomerDao;



public  class CustomerDaolmpl implements CustomerDao {

	List<AccountPojo> allRecord;
	

	
private int customerId;



private int returnAccountPojo;

//	private List<AccountPojo> allRecord;

//	private int newaccountId;

//	private int newaccountId;.size();
	public  CustomerDaolmpl() {
		//allcustomerId = new ArrayList<CustomerDao>();
//		allcustomerId.add(new CustomerPojo(101, "Harry Potter and the Chamber of Secrets", "J.K.Rowling", "Fiction", 40, ""));
//		allcustomerId.add(new CustomerPojo(102, "Harry Potter and the Goblet of Fire", "J.K.Rowling", "Fiction", 35, ""));
//		allcustomerId.add(new CustomerPojo(103, "Harry Potter and the Half Blood Prince", "J.K.Rowling", "Fiction", 45, ""));
	}
	@Override
	public List<AccountPojo> fetchAllaccounts() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public AccountPojo addaccount(AccountPojo accountPojo) {
		// TODO Auto-generated method stub
		int newcustomerId = allRecord.get(allRecord.size()-1).getCustomerId() + 1;
		
		// breaking down line 26
		//int lastIndex = allBooks.size()-1;
		//BookPojo lastBook = allBooks.get(lastIndex);
		//int lastBookId = lastBook.getBookId();
		//int newBookId = lastBookId + 1;
		
		accountPojo.setCustomerId(newcustomerId);
		allRecord.add(accountPojo);
		return accountPojo;
	}
	@Override
	public AccountPojo updateaccount(AccountPojo accountPojo) {
		// TODO Auto-generated method stub
		for(int i=0; i<allRecord.size(); i++) {
			if(allRecord.get(i).getCustomerId() == accountPojo.getCustomerId()) {
				allRecord.set(i, accountPojo);
			}
		}
		return accountPojo;
	}

	@Override
	public AccountPojo deleteaccount(AccountPojo accountPojo) {
		// TODO Auto-generated method stub
		AccountPojo returnAccountPojo = null;
		for(int i=0; i<allRecord.size(); i++) {
			if(allRecord.get(i).getAccountID() == customerId) {
				returnAccountPojo = allRecord.get(i);
				allRecord.remove(i);
			}
		}
		return returnAccountPojo;
	}
	@Override
	public AccountPojo fetchAaccount(AccountPojo accountPojo) {
		// TODO Auto-generated method stub
		AccountPojo returnBookPojo = null;
		
		//iterrating an ArrayList using for loop
//		for(int i=0; i<allBooks.size(); i++) {
//			if(allBooks.get(i).getBookId() == bookId) {
//				returnBookPojo = allBooks.get(i);
//			}
//		}
		
		//iterrating an ArrayList using using Iterator
		Iterator<AccountPojo> itr = allRecord.iterator();
		while(itr.hasNext()) {
			AccountPojo account = itr.next();
			if(account.getCustomerId() == customerId) {
				returnAccountPojo = customerId;
			}	
		}
		return returnBookPojo;
	}
	@Override
	public AccountPojo fetchAllRecord(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public AccountPojo addCustomerId(AccountPojo accountPojo) {
		// TODO Auto-generated method stub
		return null;
	}




	
}