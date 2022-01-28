//import classandobjects.fordfigo;

public class finalcostofroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		room_Cost room_Cost;
		room_Cost = new room_Cost();
		
		room_Cost.length=50;
		room_Cost.width = 25;
	    room_Cost.height=78;
		room_Cost.sqfeet= 12;
		
		
		room_Cost.room_Cost();
		
		System.out.println("this is the cost to paint the room;" + "$"+ room_Cost.room_Cost());
		
		
	
		}

	}


