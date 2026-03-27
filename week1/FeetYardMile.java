import java.util.Scanner;
public class FeetYardMile{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		double distFeet,distYard, distMile;
		System.out.println("Enter distance in feet");
		distFeet=input.nextDouble();
		distYard=distFeet/3;
		distMile=distYard/1760;
		System.out.println("The distance in yard is "+distYard+" while the distance in miles is "+distMile);
	}
}