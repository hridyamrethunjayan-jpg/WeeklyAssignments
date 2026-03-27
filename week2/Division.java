import java.util.Scanner;
public class Division{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double number1,number2,quotient,remainder;
		System.out.println("Enter the first number");
		number1=input.nextDouble();
		System.out.println("Enter the second number");
		number2=input.nextDouble();
		quotient=number1/number2;
		remainder=number1%number2;		
		System.out.println("The quotient is "+quotient+" and remainder is "+remainder+" of two numbers "+number1+" and "+number2);
	}
}