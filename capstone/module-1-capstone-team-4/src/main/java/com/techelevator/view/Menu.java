package com.techelevator.view;

import com.techelevator.Items.VendingItems;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Menu {

	private PrintWriter out;
	private Scanner in;

	public Menu(InputStream input, OutputStream output) {
		this.out = new PrintWriter(output);
		this.in = new Scanner(input);
	}

	public Object getChoiceFromOptions(Object[] options) {
		Object choice = null;
		while (choice == null) {
			displayMenuOptions(options);
			choice = getChoiceFromUserInput(options);
		}
		return choice;
	}

	private Object getChoiceFromUserInput(Object[] options) {
		Object choice = null;
		String userInput = in.nextLine();
		try {
			int selectedOption = Integer.valueOf(userInput);
			if (selectedOption > 0 && selectedOption <= options.length) {
				choice = options[selectedOption - 1];
			}
		} catch (NumberFormatException e) {
			// eat the exception, an error message will be displayed below since choice will be null
		}
		if (choice == null) {
			out.println(System.lineSeparator() + "*** " + userInput + " is not a valid option ***" + System.lineSeparator());
		}
		return choice;
	}

	private void displayMenuOptions(Object[] options) {
		out.println();
		// Hard code to display only 3 menu options
		for (int i = 0; i < 3; i++) {
			int optionNum = i + 1;
			out.println(optionNum + ") " + options[i]);
		}
		out.print(System.lineSeparator() + "Please choose an option >>> ");
		out.flush();
	}

	public void displayMainMenuBanner() {
		out.println();
		out.println("********************************");
		out.println("*       Vendo-Matic 800        *");
		out.println("*        Umbrella Corp         *");
		out.println("********************************");
	}

	public String getSlotLocationFromUserInput(List<VendingItems> items) {
		//Object choice = null;
		boolean isValidChoice = false;
		String selectedOption = "";

		while (isValidChoice == false) {

			out.print(System.lineSeparator() + "Please choose an option >>> ");
			out.flush();
			selectedOption = in.nextLine();
			for(VendingItems item : items) {
				if (item.getSlotLocation().equals(selectedOption)) {
					isValidChoice = true;
					break;
				}
			}
			if (isValidChoice == false) {
				out.println(System.lineSeparator() + "*** " + selectedOption + " is not a valid option ***" + System.lineSeparator());
				out.flush();
			}
		}
		return selectedOption;
	}

	public BigDecimal takeMoneyFromUser() {
		BigDecimal amountDeposited = new BigDecimal("0.00");
		boolean isValidChoice = false;

		while (isValidChoice == false) {
			out.print(System.lineSeparator() + "Please enter money in whole dollar amounts >>> ");
			out.flush();
			String userInput = in.nextLine();

			try {
				amountDeposited = new BigDecimal(userInput);
				if (amountDeposited.doubleValue() % 1.00 == 0) {
					isValidChoice = true;
				} else {
					out.println(System.lineSeparator() + "*** Invalid input: Please enter whole dollar amounts ***");
					out.flush();
				}
			} catch (NumberFormatException ex) {
				out.println(System.lineSeparator() + "*** " + userInput + " is not a valid option ***" + System.lineSeparator());
				out.flush();
			}
		}
		return amountDeposited;
	}
}
