package com.techelevator;
import java.util.*;
import java.io.*;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {

System.out.println("What is the file path?");
Scanner input = new Scanner(System.in);
String path = input.nextLine();

System.out.println("What word are you searching for?");
String searchWord = input.nextLine();

System.out.println("Should the search be case sensitive? Y/N");
String caseInput = input.nextLine();

boolean isCaseSensitive = caseInput.equals("Y");

File file = new File(path);

int i = 1;

Scanner fileInput = new Scanner(file);

	while(fileInput.hasNextLine()) {
		String line = fileInput.nextLine();
		if(isCaseSensitive == false){
			if(line.toLowerCase().contains(searchWord.toLowerCase())){
				System.out.println(i + ") "  + line);
			}
		} else {
			if(line.contains(searchWord)){
				System.out.println(i + ") "  + line);

			}
		}
		i++;

	}


	}
	}



