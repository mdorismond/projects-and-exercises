package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercises {

	/*
	 Note, for-each is preferred, and should be used when possible.
	 */

	/*
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order
	 array2List( {"Apple", "Orange", "Banana"} )  ->  ["Apple", "Orange", "Banana"]
	 array2List( {"Red", "Orange", "Yellow"} )  ->  ["Red", "Orange", "Yellow"]
	 array2List( {"Left", "Right", "Forward", "Back"} )  ->  ["Left", "Right", "Forward", "Back"]
	 */
	public List<String> array2List(String[] stringArray) {
		String[] arrayList = {"Apple", "Orange", "Banana"};
		List<String> array2List = Arrays.asList(arrayList);
		{
			return Arrays.asList(stringArray);
		}


	}

	/*
	 Given a list of Strings, return an array containing the same Strings in the same order
	 list2Array( ["Apple", "Orange", "Banana"] )  ->  {"Apple", "Orange", "Banana"}
	 list2Array( ["Red", "Orange", "Yellow"] )  ->  {"Red", "Orange", "Yellow"}
	 list2Array( ["Left", "Right", "Forward", "Back"] )  ->  {"Left", "Right", "Forward", "Back"}
	 */
	public String[] list2Array(List<String> stringList) {

		String[] arrayOfStrings = new String[(stringList.size())];

		for (int i = 0; i < stringList.size(); i++) {
			arrayOfStrings[i] = stringList.get(i);
			System.out.println(arrayOfStrings[i]);
		}

		return arrayOfStrings;
	}

	/*
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order
	 except for any words that contain exactly 4 characters.
	 no4LetterWords( {"Train", "Boat", "Car"} )  ->  ["Train", "Car"]
	 no4LetterWords( {"Red", "White", "Blue"} )  ->  ["Red", "White"]
	 no4LetterWords( {"Jack", "Jill", "Jane", "John", "Jim"} )  ->  ["Jim"]
	 */
	//I got help online with this problem, I was confused

	public List<String> no4LetterWords(String[] stringArray) {

		List<String> listOfStrings = new ArrayList<String>();

		if(stringArray.length > 0) {

			for(int i = 0; i < stringArray.length; i++) {

				String item = stringArray[i];

				//length of string must not be 4,if this is the case add it to arraylist
				if(item.length() != 4) {
					listOfStrings.add(item);
				}
			}
		}

		return listOfStrings;
	}

//}

	/*
	 Given an array of ints, divide each int by 2, and return an ArrayList of Doubles.
	 arrayInt2ListDouble( {5, 8, 11, 200, 97} ) -> [2.5, 4.0, 5.5, 100, 48.5]
	 arrayInt2ListDouble( {745, 23, 44, 9017, 6} ) -> [372.5, 11.5, 22, 4508.5, 3]
	 arrayInt2ListDouble( {84, 99, 3285, 13, 877} ) -> [42, 49.5, 1642.5, 6.5, 438.5]
	 */
	public List<Double> arrayInt2ListDouble(int[] intArray){
		List<Double> arrOfDoubles = new ArrayList<Double>();
	double double1;
		if(intArray.length > 0) {
		for(int i = 0; i < intArray.length; i++) {
			double1 = intArray[i] / 2.0;
			arrOfDoubles.add(double1);
		}
	}
		return arrOfDoubles;
}


	/*
	 Given a List of Integers, return the largest value.
	 findLargest( [11, 200, 43, 84, 9917, 4321, 1, 33333, 8997] ) -> 33333
	 findLargest( [987, 1234, 9381, 731, 43718, 8932] ) -> 43718
	 findLargest( [34070, 1380, 81238, 7782, 234, 64362, 627] ) -> 81238
	 */
	public Integer findLargest(List<Integer> integerList) {
		int largest = integerList.get(0);

		for(int i = 0; i < integerList.size(); i++) {
			if(integerList.get(i) > largest) {
				largest = integerList.get(i);
			}
		}
		return largest;
	}
	/*
	 Given an array of Integers, return a List of Integers containing just the odd values.
	 oddOnly( {112, 201, 774, 92, 9, 83, 41872} ) -> [201, 9, 83]
	 oddOnly( {1143, 555, 7, 1772, 9953, 643} ) -> [1143, 555, 7, 9953, 643]
	 oddOnly( {734, 233, 782, 811, 3, 9999} ) -> [233, 811, 3, 9999]
	 */
	public List<Integer> oddOnly(Integer[] integerArray) {
		List<Integer> listOfIntegers = new ArrayList<Integer>();

		for(int i = 0; i < integerArray.length; i++) {
			if(integerArray[i] % 2 == 1) {
				listOfIntegers.add(integerArray[i]);
			}
		}
		return listOfIntegers;
	}

	/*
	 Given a List of Integers, and an int value, return true if the int value appears two or more times in
	 the list.
	 foundIntTwice( [5, 7, 9, 5, 11], 5 ) -> true
	 foundIntTwice( [6, 8, 10, 11, 13], 8 -> false
	 foundIntTwice( [9, 9, 44, 2, 88, 9], 9) -> true
	 */
	public boolean foundIntTwice(List<Integer> integerList, int intToFind) {
		int counter = 0;

		for(int i = 0; i < integerList.size(); i++) {

			if(integerList.get(i) == intToFind) {
				counter++;
				if(counter >= 2) {

					return true;
				}
			}
		}
		return false;
	}

	/*
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
		List<String> retString = new ArrayList<>();
		boolean m3 = false;  //for checking multiple of 3
		boolean m5 = false;  //for checking  multiple of 5

		for (Integer currInt : integerArray) {
			if (currInt % 3 == 0){ m3 = true; }
			else { m3= false; }
			if (currInt % 5 == 0 ){  	m5 = true;
			} else { m5 = false; }
			// you can simplify the above statement if you want

			if (m3 && m5) {
				retString.add(new String("FizzBuzz"));
			} else if (m3) {
				retString.add(new String("Fizz"));
			} else if (m5) {
				retString .add(new String("Buzz"));
			} else {
				retString .add(currInt.toString());
			}
		}
		return retString;
	}



	/*
	 Given two lists of Integers, interleave them beginning with the first element in the first list followed
	 by the first element of the second. Continue interleaving the elements until all elements have been interwoven.
	 Return the new list. If the lists are of unequal lengths, simply attach the remaining elements of the longer
	 list to the new list before returning it.
	 interleaveLists( [1, 2, 3], [4, 5, 6] )  ->  [1, 4, 2, 5, 3, 6]
	 */
	public static List<Integer> interleaveLists(List<Integer> listOne, List<Integer> listTwo) {

		//int minListLength = Math.min(listOne.size(), listTwo.size());
		int minListLength ;
		boolean listOneBigger = false;
		if (listOne.size() > listTwo.size()){
			minListLength = listTwo.size();
			listOneBigger = true;
		} else {
			minListLength = listOne.size();
		}

		List<Integer> output = new ArrayList<>();

		for (int i = 0; i < minListLength; i++) {
			output.add(listOne.get(i));
			output.add(listTwo.get(i));
		}

		// Add remainder Logic
		List<Integer> longerList;
		if (listOneBigger) {
			longerList = listOne;
		} else {
			longerList = listTwo;
		}

		for (int i = minListLength; i < longerList.size(); i++) {
			output.add(longerList.get(i));
		}

		return output;
	}




}
