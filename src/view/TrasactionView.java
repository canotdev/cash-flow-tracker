package view;

import model.Transaction;
import java.util.List;

public class TrasactionView {

	public void displayTransaction(Transaction transactions) {
		System.out.println("Summary: "  + transactions.getSummary());
		System.out.println("Date: "  + transactions.getDate());
		System.out.println("-------------------------------------------------------");
	}
	
	public void displayAllTransaction(List<Transaction>transactions) {
		for(Transaction t : transactions) {
			displayTransaction(t);
		}
	}
		
	public void displayBalance(double income, double expense, double balance) {
		System.out.println("Total Income: $ " + income);
		System.out.println("Total Expense: $ " + expense);
		System.out.println("Balance: $ " + balance);
	}
	
	public void displayMessage(String message) {
		System.out.println(message);
	}
}

