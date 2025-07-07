package tnsCode;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Welcome to leap year check");
		System.out.println("please enter year: ");
	
		int year = sc.nextInt();
		if( (year%4== 0 && year%100 != 0)||(year%400 == 0)){
			System.out.println(" yes it is a leap year :"+ year);
		}else
		{
			System.out.println("not a leap year");
		}

	}

}
