package com.techelevator;
import java.util.Scanner;


public class Fibonacci {

	public static void main(String[] args) {
		//get user input
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter number:");
		String inputString = userInput.nextLine();

		//Convert input to integer
		int numbersInSequence = Integer.parseInt(inputString);

		//declare numbers used in sequence
		int a = 0;
		int b = 1;

		//declare final string as empty
		String  fibonacci = "";

		//do loops based on the number the user inputted
		for (int i = 1; i <= numbersInSequence; i++){
			//add  number to final string
			fibonacci = fibonacci+ a ;

			//If this isn't the last time of loop, add a comma
			// to the end of the final string
			if(i != numbersInSequence){
				fibonacci = fibonacci+",";
			}
			//add last 2 defined numbers
			int contSequence = a + b;

			//reassign a to the value of b
			a = b;
			//reassign b to the value of contSequence
			b = contSequence;


		}
		//print out final sequence
		System.out.print(fibonacci);
	}

}
