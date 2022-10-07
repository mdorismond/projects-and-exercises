package com.techelevator;
import java.util.*;
import java.io.*;

public class FileSplitter {

	public static void main(String[] args) {



// object for user input
		Scanner in = new Scanner(System.in);

		// declare variables
		int flag = 0;
		int lineNumber = 0;

		// prompt user to enter a file name
		// we can change files here as per our choice
		System.out.println("What is the fully qualified name of the file that should be searched?");
		String filename = in.nextLine();

		// prompt user to enter a word to search
		System.out.println("What is the search word you are looking for?");
		String word = in.nextLine();

		// prompt user for choice
		System.out.println("Should the search be case sensitive? (Y/N)");
		String choice = in.nextLine();

		// choice is N then make word to lower case and set flag as 1
		if(choice.equals("N"))
		{
			word = word.toLowerCase();
			flag = 1;
		}

		// create an object of BufferedReader class for file reading
		BufferedReader reader;
		try
		{
			// open file
			reader = new BufferedReader(new FileReader(filename));

			// read first line
			String line = reader.readLine();

			// increase line number by 1
			lineNumber++;

			// now, loop to read all remaining lines
			while (line != null)
			{
				// check if flag is 1
				if(flag == 1)
				{
					// convert line to lower case
					String temp = line.toLowerCase();

					// now, check if this line contains the given word as a substring
					if(temp.contains(word))
					{
						// if yes then print line number along with line
						System.out.println(lineNumber + ")" + line);
					}
				}

				// otherwise,
				else
				{
					// directly check for word in the line
					if(line.contains(word))
					{
						System.out.println(lineNumber + ")" + line);
					}
				}

				// read next line and increase line number by 1
				line = reader.readLine();
				lineNumber++;
			}

			// close file
			reader.close();
		}

		// exception handling
		catch (IOException e)
		{
			System.out.println("File not found!");
		}
	}
}
