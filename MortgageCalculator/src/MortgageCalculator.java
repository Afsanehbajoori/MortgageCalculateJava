import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

	public static void main(String[] args) {
		final byte MonthsInYear=12;
		final byte Precent=100;
		int Principal=0;
		float annualInterest=0;
		int numberOfPayments=0;
		float monthlyInterest=0;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		System.out.print("Principal ($1K-$1M):");
		Principal=scan.nextInt();
		if(Principal>=1000 && Principal<=1_000_000)
			break;
		System.out.print("Enter a value between 1000 and 1000000.");
		}
		
		while(true) {
		System.out.print("Annual Interest Rate:");
		annualInterest= scan.nextFloat();
		if(annualInterest>=1 && annualInterest<=30) {
			monthlyInterest = annualInterest / Precent /MonthsInYear;
			break;
		}
		System.out.print("Enter a value between 1 and 30.");
			
		
		}
		
		while(true) {
		System.out.print("Period (Years):");
		byte years=scan.nextByte();
		if(years>=1 && years<=30) {
			numberOfPayments= years *MonthsInYear;
			break;
		}
		System.out.print("Enter a value between 1 and 30.");
		
		}
		
		double mortgage=Principal*(monthlyInterest*Math.pow(1+monthlyInterest , numberOfPayments))/(Math.pow(1+monthlyInterest ,numberOfPayments )-1);
		
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("Mortgage:" + mortgageFormatted );
	}

}
