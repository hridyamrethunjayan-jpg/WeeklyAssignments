import java.util.Scanner;
public class largest{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int number1, number2, number3;
		System.out.println("Enter first number");
		number1=in.nextInt();
		System.out.println("Enter second number");
		number2=in.nextInt();
		System.out.println("Enter third number");
		number3=in.nextInt();
		boolean result1=(number1>number2 && number1>number3);
		System.out.println("Is the first number the largest? "+result1);
		boolean result2=(number2>number1 && number2>number3);
		System.out.println("Is the second number the largest? "+result2);
		boolean result3=(number3>number1 && number3>number2);
		System.out.println("Is the third number the largest? "+result3);
	}
}