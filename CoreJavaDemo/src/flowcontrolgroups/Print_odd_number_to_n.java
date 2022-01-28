package flowcontrolgroups;
import java.util.Scanner;

public class Print_odd_number_to_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create object of scanner class
				Scanner scanner = new Scanner(System.in);

				// enter the value of " n ".
				System.out.print("Enter the value n : ");

				// read the value.
				int n = scanner.nextInt();

				System.out.println("Numbers are : " );
				for(int i=1; i<=n; i++) 
				{
					System.out.println(i);
				}
	}

}
