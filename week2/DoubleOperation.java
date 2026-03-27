import java.util.Scanner;
public class DoubleOperation{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double a,b,c;
		System.out.println("Enter value of a");
		a=input.nextDouble();
		System.out.println("Enter value of b");
		b=input.nextDouble();
		System.out.println("Enter value of c");
		c=input.nextDouble();
		double doubleop1,doubleop2,doubleop3,doubleop4;
		doubleop1=a+b*c;
		doubleop2=a*b+c;
		doubleop3=c+a/b;
		doubleop4=a%b+c;
		System.out.println("The results of Int Operations are "+doubleop1+", "+doubleop2+", "+doubleop3+", "+doubleop4);
	
	}
}