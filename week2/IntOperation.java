import java.util.Scanner;
public class IntOperation{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter value of a");
		a=input.nextInt();
		System.out.println("Enter value of b");
		b=input.nextInt();
		System.out.println("Enter value of c");
		c=input.nextInt();
		double intop1,intop2,intop3, intop4;
		intop1=a+b*c;
		intop2=a*b+c;
		intop3=c+a/b;
		intop4=a%b+c;
		System.out.println("The results of Int Operations are "+intop1+", "+intop2+", "+intop3+", "+intop4);
		
	}
}