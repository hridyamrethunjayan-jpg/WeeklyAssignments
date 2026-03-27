import java.util.Scanner;
public class SwapNumbers{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int number1, number2, temp;
		System.out.println("Enter the first number");
		number1=input.nextInt();
		System.out.println("Enter the second number");
		number2=input.nextInt();
		temp=number1;
		number1=number2;
		number2=temp;
		System.out.println("The swapped numbers are "+number1+" and "+number2);
	}
}		