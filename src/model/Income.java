package model;

import java.time.LocalDate;

public class Income extends Transaction {
	
	private String source;
	
	public Income(int id, String description, double value, LocalDate date, String source) {
		super (id, description, value, date);
		this.source = source;
	}

	public String getSource() {
		return source;
	}
	
	public void setSource(String source) {
		this.source = source;
	}
	
	@Override
	public String getSummary() {
		return "[-]" + getDescription() + " - $" + getValue();
	}
	
}
