import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Create a program that reads in a dollar amount for the cost of an item
		 * Read in a second amount for how much was paid
		 * Print out how to break it into change
		 * How many 100s,50s,20s,10s,5s,toonies,loonies,quarters,dimes,nickels.
		 * If it does not end in a 5 or 0, you must round the number appropriately.
		 * If the payment doesn't cover the cost, output the amount still owing.
		 * Also reminder that as many edge cases as possible should be patched.
		 */ 
		Scanner in=new Scanner(System.in);
		System.out.println("How much is the cost?");
		double cost=in.nextDouble();
		if (cost<0) {
			System.out.println("Wait, what?");
		} else {
		/*do {
			try {
				cost=in.nextDouble();
			}catch(Exception e) {
				in.nextLine();
				System.out.println("Try again.");
			}
		}while (cost<0);*/
		
		System.out.println("How much was paid?");
		double payment=in.nextDouble();
		
		if (payment<0) {
			System.out.println("Do not rob the cashier. Try again.");
		} else {
		/*do {
			try {
				payment=in.nextDouble();
			}catch(Exception e) {
				in.nextLine();
				System.out.println("Try again");
			}
		}while (payment<0);*/
		
		double change3 = payment-cost;
		double change2 = Math.round((change3)*20);
		double change = ((change2)/20);	
				
		if (change<0) { 
		    System.out.println("You still owe $"+-change+".");
		} else if (change==0){
			System.out.println("You have paid in full.");
		} else {
			System.out.println("Your change is $"+change+".");

			int hundreds= (int)(change/100);
			if (hundreds != 0) {
				System.out.println(hundreds+" $100 bills");}
			double frist = (change-100*hundreds);

			int fifties= (int)(frist/50);
			if (fifties != 0) {
				System.out.println(fifties+" $50 bills");}
			double second = (frist-50*fifties);

			int twenties= (int)(second/20);
			if (twenties != 0) {
				System.out.println(twenties+" $20 bills");}
			double third = (second-20*twenties);

			int tens= (int)(third/10);
			if (tens != 0) {
				System.out.println(tens+" $10 bills");}
			double fourth = (third-10*tens);

			int fivers= (int)(fourth/5);
			if (fivers != 0) {
				System.out.println(fivers+" $5 bills");}
			double fifth = (fourth-5*fivers);

			int toonies= (int)(fifth/2);
			if (toonies != 0) {
				System.out.println(toonies+" toonies");}
			double sixth = (fifth-2*toonies);

			int loonies= (int)(sixth);
			if (loonies != 0) {
				System.out.println(loonies+" loonies");}
			double seventh = (sixth-loonies);

			int quarters= (int)(seventh*4);
			if (quarters != 0) {
				System.out.println(quarters+" quarters");}
			double eighth = (seventh-0.25*quarters);

			int dimes= (int)(eighth*10);
			if (dimes != 0) {
			System.out.println(dimes+ " dimes");}
			double ninth= (eighth-0.1*dimes);

			int nickels= (int)Math.round((ninth*20));
			if (nickels != 0) {
			System.out.println(nickels+ " nickels");}
			
			/*if (ninth<0.025){
			nickels=0;
		    } else if (ninth>=0.025&&ninth<0.075) { 
			nickels=1;
			} else if (ninth>=0.075&&ninth<0.1) {
			dimes = dimes+1;}*/
		}
      }
    }
  }
}