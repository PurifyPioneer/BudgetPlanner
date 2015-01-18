package core;

public class BudgetManager {

	public static final int BUDGET_SPENDABLE = 1;
	public static final int BUDGET_SAVED = 2;
	public static final int BUDGET_UNASSIGNED = 3;
	public static final int BUDGET_GENERAL = 4;

	private double budgetSpenadble;
	private double budgetSaved;
	private double budgetUnassigned;
	private double budgetGeneral;

	public BudgetManager() {
		calculateBudget();
	}

	public void printBudgetInfo() {
		System.out.println("Spenadble Budget : " + getBudgetSpenadble());
		System.out.println("Saved Budget     : " + getBudgetSaved());
		System.out.println("Unassigned Budget: " + getBudgetUnassigned());
		System.out.println("General Budget   : " + getBudgetGeneral());
	}

	private void calculateBudget() {
		setBudgetGeneral(getBudgetSpenadble() + getBudgetSaved()
				+ getBudgetUnassigned());
	}

	public void addMoney(double value, int origin, int target) {

		if (origin == BUDGET_UNASSIGNED) {
			if (target == BUDGET_SAVED) {
				if ((getBudgetUnassigned() - value) >= 0) {
					setBudgetUnassigned(getBudgetUnassigned() - value);
					setBudgetSaved(getBudgetSaved() + value);
				}
			} else if (target == BUDGET_SPENDABLE) {
				if ((getBudgetUnassigned() - value) >= 0) {
					setBudgetUnassigned(getBudgetUnassigned() - value);
					setBudgetSpenadble(getBudgetSpenadble() + value);
				}
			} else {
				System.out.println("No correct target found!");
			}

		} else if (origin == BUDGET_SAVED) {
			if (target == BUDGET_UNASSIGNED) {
				if ((getBudgetSaved() - value) >= 0) {
					setBudgetSaved(getBudgetSaved() - value);
					setBudgetUnassigned(getBudgetUnassigned() + value);
				}
			} else if (target == BUDGET_SPENDABLE) {
				if ((getBudgetSaved() - value) >= 0) {
					setBudgetSaved(getBudgetSaved() - value);
					setBudgetSpenadble(getBudgetSpenadble() + value);
				}
			} else {
				System.out.println("No correct target found!");
			}

		} else if (origin == BUDGET_SPENDABLE) {
			if (target == BUDGET_UNASSIGNED) {
				if ((getBudgetSpenadble() - value) >= 0) {
					setBudgetSaved(getBudgetSaved() - value);
					setBudgetUnassigned(getBudgetUnassigned() + value);
				}
			} else if (target == BUDGET_SAVED) {
				if ((getBudgetSpenadble() - value) >= 0) {
					setBudgetSpenadble(getBudgetSpenadble() - value);
					setBudgetSaved(getBudgetSaved() + value);
				}
			} else {
				System.out.println("No correct target found!");
			}

		} else {
			System.out.println("No correct origin found!");
		}

	}

	
	public double getBudgetSpenadble() {
		return budgetSpenadble;
	}

	private void setBudgetSpenadble(double budgetSpenadble) {
		this.budgetSpenadble = budgetSpenadble;
	}

	public double getBudgetSaved() {
		return budgetSaved;
	}

	private void setBudgetSaved(double budgetSaved) {
		this.budgetSaved = budgetSaved;
	}

	public double getBudgetUnassigned() {
		return budgetUnassigned;
	}

	private void setBudgetUnassigned(double budgetUnassigned) {
		this.budgetUnassigned = budgetUnassigned;
	}

	public double getBudgetGeneral() {
		return budgetGeneral;
	}

	private void setBudgetGeneral(double budgetGeneral) {
		this.budgetGeneral = budgetGeneral;
	}

}
