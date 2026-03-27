import java.util.Scanner;
public class Chocolates{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int numberOfChocolates, numberOfChildren, eachChildGets, remaining;
		System.out.println("Enter the number of chocolates");
		numberOfChocolates=input.nextInt();
		System.out.println("Enter the number of children");
		numberOfChildren=input.nextInt();
		eachChildGets=numberOfChocolates/numberOfChildren;
		remaining=numberOfChocolates%numberOfChildren;
		System.out.println("The number of chocolates each child gets is "+eachChildGets+" and the number of remaining chocolates are "+remaining);
	}
}