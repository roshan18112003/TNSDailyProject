package tnsCode;

import java.util.Scanner;

public class evenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter number you want to print even num till : ");
		int num = sc.nextInt();
		for(int i=1 ; i<=num; i++) {
			if(i%2==0) {
				System.out.println( "even numbers :"+ i + " ");
			}
			
		}

	}

}
