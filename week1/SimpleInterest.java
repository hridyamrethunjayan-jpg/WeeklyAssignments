import java.util.Scanner;
public class SimpleInterest{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		double principal, rate, time, simpleInterest;
		System.out.println("Enter the principal amount");
		principal=input.nextDouble();
		System.out.println("Enter the rate");
		rate=input.nextDouble();
		System.out.println("Enter the time in years");
		time=input.nextDouble();
		simpleInterest=(principal*rate*time)/100.0;
		System.out.println("The simple interest is "+simpleInterest+ 
							"for Principal "+principal+" , rate of interest "+rate+" and time "+time);
	}
}		
