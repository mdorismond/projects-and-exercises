package com.techelevator;

import com.techelevator.Items.VendingItems;
import com.techelevator.view.Menu;

import java.math.BigDecimal;
import java.util.Scanner;

public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";
	private static final String MAIN_MENU_OPTION_SALES_REPORT = "Sales Report";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT, MAIN_MENU_OPTION_SALES_REPORT };
	private static final String PURCHASING_MENU_OPTION_FEED_MONEY = "Feed Money";
	private static final String PURCHASING_MENU_OPTION_SELECT_PRODUCT = "Select Product";
	private static final String PURCHASING_MENU_OPTION_FINISH_TRANSACTION = "Finish Transaction";
	private static final String[] PURCHASING_MENU_OPTIONS = { PURCHASING_MENU_OPTION_FEED_MONEY, PURCHASING_MENU_OPTION_SELECT_PRODUCT, PURCHASING_MENU_OPTION_FINISH_TRANSACTION };

	private Menu menu;
	private VendingMachine vendoMatic;
	Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		VendingMachine vendoMatic = new VendingMachine();
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu, vendoMatic);
		vendoMatic.getInventory();
		vendoMatic.restockInventory();
		cli.run();
	}

	public VendingMachineCLI(Menu menu, VendingMachine vendoMatic)
	{
		this.menu = menu;
		this.vendoMatic = vendoMatic;
	}

	public void run() {

		menu.displayMainMenuBanner();

		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				// display vending machine items
				for (VendingItems items : vendoMatic.getVendables()) {
					System.out.println(items.getDisplayString());
				}
			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				// do purchase

				while (true) {
					String purchaseChoice = (String) menu.getChoiceFromOptions(PURCHASING_MENU_OPTIONS);

					if (purchaseChoice.equals(PURCHASING_MENU_OPTION_FEED_MONEY)) {

						// Take money
						BigDecimal dollarsEntered = menu.takeMoneyFromUser();
						vendoMatic.depositMoney(dollarsEntered);

					} else if (purchaseChoice.equals(PURCHASING_MENU_OPTION_SELECT_PRODUCT)) {
						// display items initially
						for (VendingItems items : vendoMatic.getVendables()) {
							System.out.println(items.getDisplayString());
						}
						//accept user selection
						String slotChoice =  menu.getSlotLocationFromUserInput(vendoMatic.getVendables());
						vendoMatic.makePurchase(slotChoice);

					} else if (purchaseChoice.equals(PURCHASING_MENU_OPTION_FINISH_TRANSACTION)) {
						// give change
						// exit to main menu
						vendoMatic.returnChange();
						break;
					}
				}

			} else if (choice.equals(MAIN_MENU_OPTION_EXIT)) {
				// exit
				break;
			} else if (choice.equals(MAIN_MENU_OPTION_SALES_REPORT)) {
				// generate sales report file
				vendoMatic.generateSalesReport();
			}
		}
	}
}