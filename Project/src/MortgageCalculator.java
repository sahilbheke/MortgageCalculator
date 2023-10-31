public class MortgageCalculator {
    private final static byte MONTH_IN_YEAR = 12;
    private final static byte PERCENTAGE = 100;
    private int principle;
    private float annual_Interest;
    private byte years;

    public MortgageCalculator(int principal, float annual_Interest, byte years) {
        this.principle = principal;
        this.annual_Interest = annual_Interest;
        this.years = years;
    }
    public double calculateBalance(
            short numberOfPaymentsMade
    ) {

        float monthly_Intrest = getMonthlyIntrest();
        short numberOfPayments = (short)getNumberOfPayments();

        double balance = principle * (Math.pow(1 + monthly_Intrest, numberOfPayments) - Math.pow(1 + monthly_Intrest, numberOfPaymentsMade)) / (Math.pow(1 + monthly_Intrest, numberOfPayments) - 1);

        return balance;
    }

    public double calculateMortgage() {
        float monthly_Intrest = getMonthlyIntrest();
        short numberOfPayments = (short) getNumberOfPayments();
        double mortgage = principle * (monthly_Intrest * Math.pow(monthly_Intrest + 1, numberOfPayments)) / (Math.pow(monthly_Intrest + 1, numberOfPayments) - 1);

        return mortgage;
    }
    public double[] getRemainingBalance(){
        var balances = new double[getNumberOfPayments()];
        for (short month = 1; month <= getNumberOfPayments(); month++)
            balances[month - 1] = calculateBalance(month);
        return balances;
    }
    private int getNumberOfPayments() {
        return years  * MONTH_IN_YEAR;
    }

    private float getMonthlyIntrest() {
        return annual_Interest / PERCENTAGE / MONTH_IN_YEAR;
    }

}
