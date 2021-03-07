package com.Inheritance.lab.startercode;
import java.text.NumberFormat;

public abstract class Household {
	
	private final double TAX_RATE = .2;
	
	protected double incomeGained = 0;
	
	private IPet pet;
	
	public Household(IPet pet) {
		this.pet = pet;
	}
	
	public abstract void gainIncome();
	public abstract void throwGetTogether();
	
	public void payTaxes() {
		// Your code goes here for calculation of tax
		// Print it on console e.g. "Paid $0.10 in taxes on $0.50 in income."

		
		
	}
	
	public void careForPet() {
		// call appropriate methods here

		
		
	}
}
