package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Exercises {
	public static void main(String[] args) {

		// 01
		String[] sArray = {"Apple", "Orange", "Banana"};
		List <String> ls = array2List(sArray);
		System.out.println("01: Return list is: ");
		for ( int i=0; i < ls.size() ; i++) {
			System.out.println(ls.get(i));
		}

		//02
		List <String> stringLst = new ArrayList<>();
		//["Apple", "Orange", "Banana"]
		stringLst.add("Apple");
		stringLst.add("Orange");
		stringLst.add("Banana");
		String[] sArray2 = list2Array(stringLst);
		System.out.println("02: Return String array is: ");
		for ( int i=0; i < sArray2.length ; i++) {
			System.out.println(sArray2[i]);
		}

		//03
		//no4LetterWords( {"Train", "Boat", "Car"} )  ->  ["Train", "Car"]
		String[] sArray3 = {"Train", "Boat", "Car"};
		List <String> stringLst3 = no4LetterWords(sArray3);
		System.out.println("03: Return String array is: ");
		for ( int i=0; i < stringLst3.size() ; i++) {
			System.out.println(stringLst3.get(i));
		}

		//04
		//
		//interleaveLists( [1, 2, 3], [4, 5, 6] )  ->  [1, 4, 2, 5, 3, 6]

		//public static List<Integer> interleaveLists(List<Integer> listOne, List<Integer> listTwo) {
		List <Integer> ilA = new ArrayList<>();
		ilA.add(1);
		ilA.add(2);
		ilA.add(3);
		List <Integer> ilB = new ArrayList<>();
		ilB.add(4);
		ilB.add(5);
		ilB.add(6);

		System.out.println("09: interleaveLists: ");
		List <Integer> outputL = interleaveLists(ilA, ilB);
		for ( int i=0; i < outputL.size() ; i++) {
			System.out.println(outputL.get(i));
		}



	}


	/*
	 Note, for-each is preferred, and should be used when possible.
	 */

	/* 01
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order
	 array2List( {"Apple", "Orange", "Banana"} )  ->  ["Apple", "Orange", "Banana"]
	 array2List( {"Red", "Orange", "Yellow"} )  ->  ["Red", "Orange", "Yellow"]
	 array2List( {"Left", "Right", "Forward", "Back"} )  ->  ["Left", "Right", "Forward", "Back"]
	 */
	public static List<String> array2List(String[] stringArray) {
		List <String> stringList = new ArrayList<>();
		for (int i = 0; i < stringArray.length; i++) {
			stringList.add(stringArray[i]);
		}
		return stringList;
	}

	/* 02
	 Given a list of Strings, return an array containing the same Strings in the same order
	 list2Array( ["Apple", "Orange", "Banana"] )  ->  {"Apple", "Orange", "Banana"}
	 list2Array( ["Red", "Orange", "Yellow"] )  ->  {"Red", "Orange", "Yellow"}
	 list2Array( ["Left", "Right", "Forward", "Back"] )  ->  {"Left", "Right", "Forward", "Back"}
	 */
	public static String[] list2Array(List<String> stringList) {
		String[] stringArray = new String[stringList.size()];
		for (int i = 0; i < stringList.size(); i++) {
			stringArray[i] = stringList.get(i);
		}
		return stringArray;
	}

	/* 03
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order
	 except for any words that contain exactly 4 characters.
	 no4LetterWords( {"Train", "Boat", "Car"} )  ->  ["Train", "Car"]
	 no4LetterWords( {"Red", "White", "Blue"} )  ->  ["Red", "White"]
	 no4LetterWords( {"Jack", "Jill", "Jane", "John", "Jim"} )  ->  ["Jim"]
	 */
	public static List<String> no4LetterWords(String[] stringArray) {
		List<String> no4LetterWordList = new ArrayList<>();
		for (int i = 0; i < stringArray.length; i++) {
			if (stringArray[i].length() != 4) {
				no4LetterWordList.add(stringArray[i]);
			}
		}
		return no4LetterWordList;


	}

	/* 04
	 Given an array of ints, divide each int by 2, and return an ArrayList of Doubles.
	 arrayInt2ListDouble( {5, 8, 11, 200, 97} ) -> [2.5, 4.0, 5.5, 100, 48.5]
	 arrayInt2ListDouble( {745, 23, 44, 9017, 6} ) -> [372.5, 11.5, 22, 4508.5, 3]
	 arrayInt2ListDouble( {84, 99, 3285, 13, 877} ) -> [42, 49.5, 1642.5, 6.5, 438.5]
	 */
	public static List<Double> arrayInt2ListDouble(int[] intArray) {
		return null;
	}

	/* 05
	 Given a List of Integers, return the largest value.
	 findLargest( [11, 200, 43, 84, 9917, 4321, 1, 33333, 8997] ) -> 33333
	 findLargest( [987, 1234, 9381, 731, 43718, 8932] ) -> 43718
	 findLargest( [34070, 1380, 81238, 7782, 234, 64362, 627] ) -> 81238
	 */
	public static Integer findLargest(List<Integer> integerList) {
		return null;
	}

	/* 06
	 Given an array of Integers, return a List of Integers containing just the odd values.
	 oddOnly( {112, 201, 774, 92, 9, 83, 41872} ) -> [201, 9, 83]
	 oddOnly( {1143, 555, 7, 1772, 9953, 643} ) -> [1143, 555, 7, 9953, 643]
	 oddOnly( {734, 233, 782, 811, 3, 9999} ) -> [233, 811, 3, 9999]
	 */
	public static List<Integer> oddOnly(Integer[] integerArray) {
		return null;
	}

	/* 07
	 Given a List of Integers, and an int value, return true if the int value appears two or more times in
	 the list.
	 foundIntTwice( [5, 7, 9, 5, 11], 5 ) -> true
	 foundIntTwice( [6, 8, 10, 11, 13], 8 -> false
	 foundIntTwice( [9, 9, 44, 2, 88, 9], 9) -> true
	 */
	public static boolean foundIntTwice(List<Integer> integerList, int intToFind) {
		return false;
	}

	/* 08
	 Given an array of Integers, return a List that contains the same Integers (as Strings). Except any multiple of 3
	must be replaced by the String "Fizz", any multiple of 5 must be replaced by the String "Buzz",
	and any multiple of both 3 and 5 must be replaced by the String "FizzBuzz."
	** INTERVIEW QUESTION **

	fizzBuzzList( {1, 2, 3} )  ->  ["1", "2", "Fizz"]
	fizzBuzzList( {4, 5, 6} )  ->  ["4", "Buzz", "Fizz"]
	fizzBuzzList( {7, 8, 9, 10, 11, 12, 13, 14, 15} )  ->  ["7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"]

	HINT: To convert an Integer x to a String, you can use x.toString() in your code. For example, if x = 1, then x.toString() returns "1."
	 */
	public static List<String> fizzBuzzList(Integer[] integerArray) {


		return null;
	}

	/* 09
	 Given two lists of Integers, interleave them beginning with the first element in the first list followed
	 by the first element of the second. Continue interleaving the elements until all elements have been interwoven.
	 Return the new list. If the lists are of unequal lengths, simply attach the remaining elements of the longer
	 list to the new list before returning it.
	 interleaveLists( [1, 2, 3], [4, 5, 6] )  ->  [1, 4, 2, 5, 3, 6]
	 */
	public static List<Integer> interleaveLists(List<Integer> listOne, List<Integer> listTwo) {

		//int minListLength = Math.min(listOne.size(), listTwo.size());
		List<Integer> output = new ArrayList<>();

		for (int i = 0; i < listOne.size(); i++) {
			output.add(listOne.get(i));
			output.add(listTwo.get(i));
		}


		return output;

	}

}
