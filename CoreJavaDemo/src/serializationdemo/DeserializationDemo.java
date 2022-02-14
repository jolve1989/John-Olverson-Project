package serializationdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class DeserializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fis = new FileInputStream("MyFile.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		// here we are not creating a new object of Account
					Account account = (Account) ois.readObject();	
					
					System.out.println(account);
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}




