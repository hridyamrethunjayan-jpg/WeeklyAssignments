import java.util.Scanner;
public class Calculator{
	public static void main(String args[]){
	Scanner input=new Scanner(System.in);
		double num1, num2;
		System.out.println("Enter two numbers");
		num1=input.nextDouble();
		num2=input.nextDouble();
		double sum, diff, product, quotient;
		sum=num1+num2;
		diff=num1-num2;
		product=num1*num2;
		if (num2==0){
			System.out.println("Division by Zero impossible");
			quotient=0;
		}
		else{
			quotient=num1/num2;
		}
		System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "+num1+" and "+num2+
							" is "+sum+", "+diff+", "+product+", "+quotient+", ");
	}
}
		