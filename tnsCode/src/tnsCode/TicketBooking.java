package tnsCode;
import java.util.Scanner;
	
public class TicketBooking {
	    private String stageEvent;
	    private String customer;
	    private Integer noOfSeats;

	    
	    public TicketBooking() {}

	    
	    public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
	        this.stageEvent = stageEvent;
	        this.customer = customer;
	        this.noOfSeats = noOfSeats;
	    }
	   
	    public String getStageEvent() {
	        return stageEvent;
	    }

	    public String getCustomer() {
	        return customer;
	    }

	    public Integer getNoOfSeats() {
	        return noOfSeats;
	    }

	    public void setStageEvent(String stageEvent) {
	        this.stageEvent = stageEvent;
	    }

	    public void setCustomer(String customer) {
	        this.customer = customer;
	    }

	    public void setNoOfSeats(Integer noOfSeats) {
	        this.noOfSeats = noOfSeats;
	    }

	    public void makePayment(Double amount) {
	        System.out.printf("Amount %.1f paid in cash\n", amount);
	    }

	    
	    public void makePayment(String walletNumber, Double amount) {
	        System.out.printf("Amount %.1f paid using wallet number %s\n", amount, walletNumber);
	    }

	    
	    public void makePayment(String creditCard, String ccv, String name, Double amount) {
	        System.out.printf("Holder name:%s\n", name);
	        System.out.printf("Amount %.1f paid using %s card\n", amount, creditCard);
	        System.out.printf("CCV:%s\n", ccv);
	    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   
		        Scanner sc = new Scanner(System.in);
System.out.println("Welcome to ticket booking ");
System.out.println("Enter ticket details in csv (e.g show,name,seat)");
System.out.println("enter stage event name: ");
		        String[] ticketInput = sc.nextLine().split(",");
		        
		        String stageEvent = ticketInput[0];
		       
		        String customer = ticketInput[1];
		        
		        Integer noOfSeats = Integer.parseInt(ticketInput[2]);

		       
		        TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);
		        
		        
		        
System.out.println("pay method :");
System.out.println("1. cash");
System.out.println("2. Wallet");
System.out.println("3. card");
System.out.println("your choice  : ");
		        
		        int choice = sc.nextInt();
		        

		      
		        switch (choice) {
		            case 1: 
		            	System.out.println("enter amount");
		                double amount1 = sc.nextDouble();
		                booking.makePayment(amount1);
		                break;

		            case 2: 
		            	System.out.println("enter amount: ");
		                double amount2 = sc.nextDouble();
		                sc.nextLine();
		                System.out.println("wallet num:");
		                String wallet = sc.nextLine();
		                booking.makePayment(wallet, amount2);
		                break;

		            case 3:
		            	System.out.println("name of card holder : ");
		                String holderName = sc.nextLine();
		                sc.nextLine();
		                System.out.println("enter amount : ");
		                double amount3 = sc.nextDouble();
		                sc.nextLine();
		                System.out.println("bank name of card : ");
		                String card = sc.nextLine();
		                System.out.println("enter cvv: ");
		                String ccv = sc.nextLine();
		                booking.makePayment(card, ccv, holderName, amount3);
		                break;

		            default:
		                System.out.println("Invalid choice");
		                
		                
				        System.out.println("Stage event:" + booking.getStageEvent());
				        System.out.println("Customer:" + booking.getCustomer());
				        System.out.println("Number of seats:" + booking.getNoOfSeats());
		                
		                
		        }


	}
	}


