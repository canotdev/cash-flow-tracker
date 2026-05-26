package model;

import java.time.LocalDate;

public abstract class Transaction {
	private int id;
	private String description;
	private double value;
	private LocalDate date;
	
	public Transaction (int id, String description, double value, LocalDate date) {
	this.id = id;
	this.description = description;
	this.value = value;
	this.date = date;
	}
	
	public int getId() {
		return id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getValue() {
		return value;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public abstract String getSummary();

}

