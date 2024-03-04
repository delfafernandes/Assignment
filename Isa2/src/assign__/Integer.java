package assign__;

import java.util.Scanner;

public class Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter first number: ");
		int Num1=scan.nextInt();
		System.out.println("Enter second number: ");
		int Num2=scan.nextInt();
		int Add= Num1+Num2;
		System.out.println(Num1 +" + "+ Num2 +" = "+ Add);
		
	}

}
