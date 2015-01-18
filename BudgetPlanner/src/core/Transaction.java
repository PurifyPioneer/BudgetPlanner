package core;


public class Transaction {

	private double value;
	private String date;
	
	public Transaction(int value, String date) {
		setTransactionValue(value);
		setTransActionDate(date);
	}
	
	private void setTransactionValue(double value) {
		this.value = value;
	}
	
	public double getTransactionValue() {
		return this.value;
	}
	
	private void setTransActionDate(String date) {
		this.date = date;
	}
	
	public String getTransactionDate() {
		return this.date;
	}
	
}
