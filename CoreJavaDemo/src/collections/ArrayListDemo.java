package collections;

import java.util.ArrayList;
import java.util.List;
//import java.util.Vector;

import classandobjects.Room;



public class ArrayListDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Feature of list
		//indexed
		//allows duplicated values
		//maintain the order
		
		//not recommended way of creating Arraylist object
		//ArrayList myList = new Vector();
		
		//recommend way (without generics
		ArrayList<Object> myList = new ArrayList<Object>();
	//	List myVector = new Vector();
		
		String str1 = "hello";
		String str2 = "Welcome";
		Room room = new Room(200,300);
		//Integer number = new Integer(10);//new integer() is  deprecated
		Integer number = 10;
		
		//C - Create
		myList.add(str1);
		myList.add(str2);
		myList.add(room);
		myList.add(number);
		
		//R-Read
		System.out.println(myList);
		System.out.println(myList.get(1));
		
	//U-Update
		
	//D-Delete

	}

}
