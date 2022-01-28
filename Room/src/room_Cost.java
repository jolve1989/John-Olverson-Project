
public class room_Cost {
	int length=5;
	int width=3;
	int height=5;
	double sqfeet=10.50;
	double cost;
	
	 double cost1() {
		  cost= (length * width * height) * sqfeet;
		  return cost;
		  
	  
	  }

 double room_Cost() {
	// TODO Auto-generated method stub
	cost= (length * width * height * sqfeet) * 4;
		  return cost;
	}
}


