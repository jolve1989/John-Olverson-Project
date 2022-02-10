package classandobjects;

//import classandobjects.RoomDemo;



public class Room implements Comparable {
	//public int length;
	int length;
	int breadth;
	//private int height;
	//static int height = 50; //  not preferred
	static int height;
	int roomNo;
	String roomColor;
//	private Object floorArea;

	
	static {
		height = 50; // correct place to initialize static variables
	}
	
//	int height=5;
//	double sqfeet=10.50;
//	double cost;
	
//	 double cost1() {
//		  cost= (length * breadth * height) * sqfeet;
//		  return cost;
		  
	  
	 

	public Room(int length, int breadth){
		// this refers to the current object
		this.length = length;
		this.breadth = breadth;
	}
 
 //CPD= copy paste Detectors
 //constructor overloading - a type of polmorphism
 public Room(int length, int breadth, int roomNo, String roomColor) {
//	 this.length = length;
//	 this.breadth = breadth;
	 
	 //constructor chaining - this()
//	 this.length, breadth;
//	 this.breadth=breath;
	 
	 //constructor chaining -this()
	 this(length, breadth);
	 this.roomNo = roomNo;
	 this.roomColor = roomColor;
 }
 

public int calculateFloorArea() {
	 int floorArea = length * breadth;
	 return floorArea;
	 }
 int calculatePaintingCost(int paintRate) {
		int wallArea = 2 * ((length * height) + (breadth * height));
		return wallArea * paintRate;
	 
	}
 
 static int computeDoubleHeight() {
	 //System.out.println(length);
	 return height * 2;
	 
 }
@Override
 public String toString(){
	 return "[length=" + length + ",breadth=" + breadth + "]";
 }

@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	int currentFA = length * breadth;
	Room incoming = (Room) o;
//	Object incoming;
	int incomingFA = incoming.length * incoming.breadth;

	return currentFA - incomingFA;
	
}

}
