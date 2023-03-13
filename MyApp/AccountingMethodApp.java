
public class AccountingMethodApp {
	// 전역변수
	public static double valueOfSupply;
	public static double vatRate;
	public static double vat;
	
	public static void main(String[] args) {
		
		valueOfSupply = 10000.0;
		vatRate = 0.1;
		vat = getVAT();
		// Local Variable - 지역변수
		double expenseRate = 0.3;
		double total = getTotal();
		double expense = getExpense(expenseRate);
		double income = getIncome(expense);
		double dividend1 = income * 0.5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;
		
		System.out.println("Value Of supply : " + valueOfSupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + total);
		System.out.println("Expense : " + expense);
		System.out.println("Income : " + income);
		System.out.println("Dividend : " + dividend1);
		System.out.println("Dividend : " + dividend2);
		System.out.println("Dividend : " + dividend3);

	}

	public static double getIncome(double expense) {
		return valueOfSupply - expense;
	}

	public static double getExpense(double expenseRate) {
		return valueOfSupply * expenseRate;
	}

	public static double getTotal() {
		return valueOfSupply + vat;
	}

	public static double getVAT() {
		return valueOfSupply * vatRate;
	}

}
