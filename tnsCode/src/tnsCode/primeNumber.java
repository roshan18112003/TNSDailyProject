package tnsCode;
import java.util.Scanner;
public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpackage tnsIndia;


		Scanner sc = new Scanner(System.in);
		System.out.println("hyy user please enter your num: ");
		int num = sc.nextInt();
		boolean ifPrime= true;
		
		for( int i=2; i<num ; i++) {
			if (num % i == 0){
	
			
					ifPrime= false;
					System.out.println("no prime");
					break;
				
		}

	}
if (ifPrime) {
	System.out.println("Yes it is prime " + num + " ");
}




	}

}
