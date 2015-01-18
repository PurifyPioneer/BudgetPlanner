package core;

import java.util.ArrayList;

public class TransactionManager {

	private ArrayList<Transaction> transactions;
	
	public TransactionManager() {
		
	}
	
	public void addTransaction(Transaction transaction) {
		transactions.add(transaction);
	}
	
	public void removeTransaction(Transaction transaction) {
		transactions.remove(transaction);
	}

}
