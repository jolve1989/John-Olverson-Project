package classandobjects;

public class A {

//	class A{

		A(){
	               // super();
			System.out.println("in A"); //second
		}
	}

	class B extends A{

		B(){
	          //     super();
			System.out.println("in B"); //third
		}
	}

	class C extends B{

		C(){
	        //        super(); // this is implicity inject by the compler
	        super(); //within a class
			System.out.println("in C");//call first 
		}
	}

	class Demo{
		public static void main(String args[]){
			// question is - in which order are the constructors called? A, B,C
			// or which class constructor is called first? c,b,a
			C c = new C();
		}
	}
