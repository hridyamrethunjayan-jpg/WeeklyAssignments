import java.util.Scanner;
public class PoundsToKgs{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		double pounds, kgs;
		System.out.println("Enter weight in pounds");
		pounds=input.nextDouble();
		kgs=pounds*2.2;
		System.out.println("The weight of the person in pounds is "+pounds+" and in kg is "+kgs);
	}
}