//program to find the ascii number of a character -----> 
//this involves the link between the int and char data type in java
//this is from this website https://www.programiz.com/java-programming/examples/ascii-value-character
public class ASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       char ch = 'b';
       int ascii = ch;
       
       //you can also cast cahr to int
       int castASCII= (int)ch;
       
       
       System.out.println(" the ascii value of " + ch + "is " + ascii);
       System.out.println(" the ascii value of " + ch + "is"  + castASCII);
       
       
	}

}
