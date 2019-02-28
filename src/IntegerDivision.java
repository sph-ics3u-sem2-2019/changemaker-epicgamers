import java.util.Scanner;

public class IntegerDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		/*System.out.println("Give me a number");
		double x=in.nextDouble();
		System.out.println("Give me a second number");
		double y=in.nextDouble();
		double quotient=x/y;
		int q=(int)(x/y);
		double r=(x%y);
		System.out.println("Regular division: "+quotient);
		System.out.println("Integer division: "+q);
		System.out.println("Remainder: "+r);*/
		System.out.println("Give me a number");
		double x=in.nextDouble();
		double h=((x*100)%5);
		System.out.println(h);
	}

}
