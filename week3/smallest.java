import java.util.Scanner;
public class smallest{
	public static void main(String args[]){
		Scanner in =  new Scanner(System.in);
		int number1, number2, number3;
		System.out.println("Enter first number");
		number1=in.nextInt();
		System.out.println("Enter second number");
		number2=in.nextInt();
		System.out.println("Enter third number");
		number3=in.nextInt();
		boolean result = ((number1<number2)&&(number1<number3));			
		System.out.println("Is the first number the smallest?"+result);
	}
}