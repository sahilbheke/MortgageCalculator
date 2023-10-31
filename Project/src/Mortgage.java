public class Mortgage {

    public static void main(String[] args){

        int principle = (int) Console.readNumber("Principle: ", 1000, 4000000);
        float annual_Intrest = (float) Console.readNumber("Annual Intrest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

        var calculator = new MortgageCalculator(principle, annual_Intrest, years);
        var report = new MortgageReport(calculator);

        report.printMortgage();
        report.printPaymentSchedule();
    }

}


/*



import java.util.Scanner;
import java.text.NumberFormat;

// package com.package;
class M{
    private int principle;
    private float annual_Intrest;
    private byte years;
    final static byte MONTH_IN_YEAR = 12;
    final static byte PERCENTAGE = 100;

    M(){
        readNumber("Principle: ", 1000, 1000000);
        readNumber("Annual Intrest Rate: ", 1, 30);
        readNumber("Period (Years): ", 1, 30);
    }
    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for(short month = 1; month <= years * MONTH_IN_YEAR; month++){
            double balance = calculateBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public void printMortgage() {

        double mortgage = calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public void readNumber(String promt, int min, int max)
    {
        int value;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print(promt);
            value = scanner.nextInt();
            if(value > min && value < max)
                break;
            System.out.println("Enter value greater than " + min + " and smaller than " + max);
        }
        if(promt == "Principle: "){
            principle = (int)value;
        }
        else if(promt == "Annual Intrest Rate: "){
            annual_Intrest = (float)value;
        }
        else if(promt == "Period (Years): ")
            years = (byte)value;
    }

    private double calculateBalance(short numberOfPaymentsMade){
        float monthly_Intrest = annual_Intrest / PERCENTAGE / MONTH_IN_YEAR;
        short numberOfPayments = (short)(years * MONTH_IN_YEAR);

        double balance = principle * (Math.pow(1 + monthly_Intrest, numberOfPayments) - Math.pow(1 + monthly_Intrest, numberOfPaymentsMade)) / (Math.pow(1 + monthly_Intrest, numberOfPayments) - 1);

        return balance;
    }
    private double calculateMortgage(){
        float monthly_Intrest = annual_Intrest / PERCENTAGE / MONTH_IN_YEAR;
        short numberOfPayments = (short)(years * MONTH_IN_YEAR);
        double mortgage = principle * (monthly_Intrest * Math.pow(monthly_Intrest + 1 , numberOfPayments)) / (Math.pow(monthly_Intrest + 1 , numberOfPayments) - 1);

        return mortgage;
    }

}
public class Main {


    public static void main(String[] args){

        M first = new M();

        first.printMortgage();

        first.printPaymentSchedule();
    }


}

 */