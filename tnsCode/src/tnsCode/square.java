package tnsCode;

import java.util.Scanner;

public class square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" hello  welcome to square calculator : ");
		int num = sc.nextInt();
				for (int i=1; i<=num; i++) {
					System.out.println("squares of "+ i + " :" + (i*i));
				}

	}

}
