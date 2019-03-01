import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		/*
		 * Create a program that reads in a dollar amount for the cost of an item
		 * Read in a second amount for how much was paid
		 * Print out how to break it into change
		 * How many 100s,50s,20s,10s,5s,toonies,loonies,quarters,dimes,nickels.
		 * if it does not end in a 5 or 0, you must round the number appropriately.
		 * if the payment doesn't cover the cost, output the amount still owing.
		 * double change2=Math.round((change3)*20);
				double change=((change2)/20);*/

		Scanner in=new Scanner(System.in);
		System.out.println("How much is the cost?");

		//Round 1 Start
		double cost3=in.nextDouble();
		double cost2=Math.round((cost3)*20);
		double cost=((cost2)/20);
		//Round 1 End
		//Once we find out a way to punish users who think they're funny by inputing text, we're freezing your computer.
		if(cost<=0){
			System.out.println("No sir, you cannot do that.");
		}else{
			/*do{
			try{
			 cost=in.nextDouble();
			  }catch(Exception e){
			  in.nextLine();
			  System.out.println("Try again.");
		    }
		}while (cost<0);*/

			System.out.println("How much was paid?");
			double payment=in.nextDouble();
			if(payment<0){
				System.out.println("Do not rob the cashier. Try again.");
			}else if((Math.round(payment*100))%5!=0){ //broken for cost=12 and payment=32.3
				System.out.println("Stop using pennies and get out of our store.");
			}else{
				/*do{
			try{
				payment=in.nextDouble();
			}catch(Exception e){
				in.nextLine();
				System.out.println("Try again");
			}
		}while (payment<0);*/
				//Round 2 Start (change)
				double change2=Math.round((payment-cost)*20);
				double change=change2/20;
				//Round 2 end (Change)

				if(change<0){
					String o;
					if (((change*100)%10)==0){o="0";}else{o=" ";}
					System.out.println("You still owe $"+-change+o);
				}else if(change==0){
					System.out.println("You have paid in full.");
				}else{
					if (((change*100)%10)==0){
						System.out.println("Your change is $"+change+"0");
					}else{System.out.println("Your change is $"+change);}
					
					int hundreds=(int)(change/100);
					if(hundreds!=0){
						char s;
						if (hundreds==1) {s=' ';}else{s='s';}
						System.out.println(hundreds+" $100 bill"+s);}
					double frist=(change-100*hundreds);

					int fifties=(int)(frist/50);
					if(fifties!=0){
						System.out.println(fifties+" $50 bill");}
					double second=(frist-50*fifties);

					int twenties=(int)(second/20);
					if(twenties!=0){
						char s;
						if (twenties==1) {s=' ';}else{s='s';}
						System.out.println(twenties+" $20 bill"+s);}
					double third=(second-20*twenties);

					int tens=(int)(third/10);
					if(tens!=0){
						System.out.println(tens+" $10 bill");}
					double fourth=(third-10*tens);

					int fivers=(int)(fourth/5);
					if(fivers!=0){
						System.out.println(fivers+" $5 bill");}
					double fifth=(fourth-5*fivers);

					int toonies=(int)(fifth/2);
					if(toonies!=0){
						char s;
						if (toonies==1) {s=' ';}else{s='s';}
						System.out.println(toonies+" toonie"+s);}
					double sixth=(fifth-2*toonies);

					int loonies=(int)(sixth);
					if(loonies!=0){
						System.out.println(loonies+" loonie");}
					double seventh=(sixth-loonies);

					int quarters=(int)(seventh*4);
					if(quarters!=0){
						char s;
						if (quarters==1) {s=' ';}else{s='s';}
						System.out.println(quarters+" quarter"+s);}
					double eighth=(seventh-0.25*quarters);

					int dimes=(int)(eighth*10);
					if(dimes!=0){
						char s;
						if (dimes==1) {s=' ';}else{s='s';}
						System.out.println(dimes+ " dime"+s);}
					double ninth=(eighth-0.1*dimes);

					int nickels=(int)Math.round(ninth*20);
					if(nickels!=0){
						System.out.println(nickels+ " nickel");}

					/*if(ninth<0.025){
						nickels=0;
		    		}else if(ninth>=0.025&&ninth<0.075){
						nickels=1;
					}else if(ninth>=0.075&&ninth<0.1){
						dimes=dimes+1;}*/
				}
			}
		}
		in.close();
	}
}
