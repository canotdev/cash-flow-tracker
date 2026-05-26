package model;

import java.time.LocalDate;

public class Expense extends Transaction{

	private Category category;
	
	public Expense(int id, String description, double value, LocalDate date, Category category) {
		super(id, description, value, date);
		this.category = category;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	@Override
	public String getSummary() {
		return "[-]" + getDescription() + " - $" + getValue() + " [" + category + "] ";
	}
	
}
