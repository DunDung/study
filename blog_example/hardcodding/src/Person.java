public class Person {
	private static final int INSTALLMENT_MONTHS = 12;
	private static final double INTEREST_RATE = 0.1;

	private int principal; // 원금

	public Person(int principal) {
		this.principal = principal;
	}

	/* 월원금을 구하는 메서드 */
	public double calculateMonthlyPrincipal() {
		return this.principal / INSTALLMENT_MONTHS;
	}

	/* 월이자를 구하는 메서드 */
	public double calculateMonthlyInterest() {
		return this.principal * INTEREST_RATE / INSTALLMENT_MONTHS;
	}
}
