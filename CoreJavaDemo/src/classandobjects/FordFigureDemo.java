package classandobjects;



public class FordFigureDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark;
		mark =50;
		
		fordfigo fordFigo;  // here is no objects
		fordFigo = new fordfigo(); //objects is created
		
		fordFigo.modelNo =123456;
		fordFigo.color = "black";
		fordFigo.cartype="hatch back";
		
		fordFigo.unlockCar();
		fordFigo.accelerater();
		fordFigo.applyBreak();
		fordFigo.lockCar();
		
		System.out.println(fordFigo.unlockCar());
		System.out.println(fordFigo.accelerater());	
		System.out.println(fordFigo.applyBreak());	
		System.out.println(fordFigo.lockCar());	
		
		fordFigo= null;
		System.out.println("---------");
		fordfigo forFigo2 = new fordfigo();
		
		forFigo2.modelNo =123456;
		forFigo2.color = "black";
		forFigo2.cartype="hatch back";
		
		System.out.println(forFigo2.unlockCar());
		System.out.println(forFigo2.accelerater());	
		System.out.println(forFigo2.applyBreak());	
		System.out.println(forFigo2.lockCar());	
		}
  
}
