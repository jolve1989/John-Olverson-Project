package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import pojo.AccountPojo;
//import pojo.CustomerPojo;
import pojo.EmployeePojo;

public class EmployeeDaoImpl implements EmployeeDao {
	List<EmployeePojo> allRecords;
	
	public  EmployeeDaoImpl() {
//		allcustomerId = new ArrayList<EmployeePojo>();
//		allcustomerId.add(new EmployeePojo(101, "Harry Potter and the Chamber of Secrets", "J.K.Rowling", "Fiction", 40, ""));
//		allcustomerId.add(new EmployeePojo(102, "Harry Potter and the Goblet of Fire", "J.K.Rowling", "Fiction", 35, ""));
//		allcustomerId.add(new EmployeePojo(103, "Harry Potter and the Half Blood Prince", "J.K.Rowling", "Fiction", 45, ""));
	}
	
/////////////////////////////////////////////
	
	@Override
	public List<EmployeePojo> AllRecord() {
		// TODO Auto-generated method stub
		return allRecords;
	}

	@Override
	public EmployeePojo addRecord(EmployeePojo employeePojo) {
		// TODO Auto-generated method stub
		int newemployeeId = newemployeeId.get(employeePojo.size()-1).employeeId() + 1;
		// breaking down line 26
		//int lastIndex = allBooks.size()-1;
		//BookPojo lastBook = allBooks.get(lastIndex);
		//int lastBookId = lastBook.getBookId();
		//int newBookId = lastBookId + 1;
		
		EmployeePojo.setAccount(newemployeeId);
		allRecords.add(employeePojo);
		return employeePojo;
	}

	@Override
	public EmployeePojo updateRecord(EmployeePojo employeePojo) {
		// TODO Auto-generated method stub
		for(int i=0; i<allBooks.size(); i++) {
			if(allBooks.get(i).getBookId() == employeePojo.getBookId()) {
				allBooks.set(i, bookPojo);
			}
		}
		return employeePojo;
	}

	@Override
	public EmployeePojo deleteRecord(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeePojo fetchARecord(int employeeId) {
		// TODO Auto-generated method stub
		EmployeePojo returnBookPojo = null;
		
		//iterrating an ArrayList using for loop
//		for(int i=0; i<allBooks.size(); i++) {
//			if(allBooks.get(i).getBookId() == bookId) {
//				returnBookPojo = allBooks.get(i);
//			}
//		}
		
		//iterrating an ArrayList using using Iterator
		Iterator<EmployeePojo> itr = allRecords.iterator();
		while(itr.hasNext()) {
			EmployeePojo employeePojo = itr.next();
			if(employeePojo.getEmployeeId() == employeeId) {
				returnBookPojo = employeePojo;
			}
		}
		
		
		//iterating an ArrayList using enhanced for loop
		
		
		//iterating an ArrayList using forEach with functional interfaces - most frequently used
		
		
		return returnEmployeePojo;

	}
}


