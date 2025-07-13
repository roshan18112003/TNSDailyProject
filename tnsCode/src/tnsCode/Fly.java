package tnsCode;

public class Fly {
	
		 static int totalSeat = 10;
	     static int seat = 1;
	     String name;
	     int mySeat;
		public Fly(String name) {
			super();
			this.name = name;
			this.mySeat = seat;
			System.out.println(name + "got seat num "+ mySeat);
			seat++;
		}
	    


	public static void main(String[] args) {
		// TODO Auto-generated method stub {
				for( int i=1; i<=12;i++) {
					String passName = "Passenger "+ i;
					if (Fly.seat <=  Fly.totalSeat) {
						new Fly(passName);
						
					}else {
						System.out.println("no seat for Passenger : "+ i);
					}
				}
			}
		     
			

		}


