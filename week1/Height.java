import java.util.Scanner;
public class Height{
	public static void main(String args[]){
		double cm,feet,inches;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your height in centimeters");
		cm=input.nextDouble();
		feet=cm/30.48;
		inches=cm/2.54;
		System.out.println("Your height in cm is "+cm+" while in feet is "+feet+" and inches is " +inches);
	}
}		