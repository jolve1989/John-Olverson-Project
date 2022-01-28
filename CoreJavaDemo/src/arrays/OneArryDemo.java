package arrays;

public class OneArryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int mark; //Declared an in variable
        mark =20;
        
        int[] myMarks;//declared an int array Variable
        myMarks = new int[5];
        
        //combining into a single line
        int[] myMarks1 = new int[5];
        
        myMarks1[0] = 20;
        myMarks1[1] = 30;
        myMarks1[2] = 40;
        myMarks1[3] = 50;
        myMarks1[4] = 60;
        
        for(int i=0; i <myMarks1.length; i++) {
          System.out.println(myMarks1[i]);	
        }
        
        //initialize a 1d array
        int[] scores = {50, 30, 40, 70};
        
	}
   
	
	
}
