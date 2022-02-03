package classandobjects;

public class fordfigo {
//decalre a variable -instance varible	
	int modelNo;
	String color;
	String cartype;
	
	String unlockCar() {
		//declare a variable-local variables
		int temp=50;
		return  "fordFigo unlocked";
		
				
	}
 String lockCar() {
	return "fordFigo locked";
	
}
String accelerater() {
	return "Forgio accelerated!";
	
}
		String applyBreak() {
			mannualBrakeSystem();
			return "fordFigo applied break!;";
			
					
		}
		void mannualBrakeSystem(){
			System.out.println("Manual Brakes applies");
			
			
			
		}
		
		
}
