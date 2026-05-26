package controller;

import model.Transaction;
import model.Income;
import model.Expense;
import model.Category;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;


public class TransactionController {
	private List<Transaction> transactions;
	
	public TransactionController() {
		this.transactions = new ArrayList<>();
	}
	
	public void addIncome(String description, double value, LocalDate date, String source) {
		int id = transactions.size() + 1;
		Income newIncome = new Income(id, description, value, date, source);
		transactions.add(newIncome);
	}
	
	public void addExpense(String description, double value, LocalDate date, Category category) {
		int id = transactions.size() + 1;
		Expense newExpense = new Expense(id, description, value, date, category);
		transactions.add(newExpense);
	}
	
	public double getTotalIncome(){
		double total = 0;
		for(Transaction t : transactions) {
			if(t instanceof Income) {
				total += t.getValue();
			}
		}
		return total;
	}
	
	public double getTotalExpense() {
		double total = 0;
		for(Transaction t : transactions) {
			if(t instanceof Expense) {
				total += t.getValue();
			}
		}
		return total;
	}
	
	public double getBalance() {
		double total = getTotalIncome() - getTotalExpense();
		return total;
	}
	
	public List<Transaction> getAllTransaction(){
		return transactions;
	}
	
}