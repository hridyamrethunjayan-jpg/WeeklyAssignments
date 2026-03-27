import java.util.Scanner;
public class AthleteTriPark{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double side1,side2,side3,rounds,perimeter;
		System.out.println("Enter the length of first side");
		side1=input.nextDouble();
		System.out.println("Enter the length of second side");
		side2=input.nextDouble();
		System.out.println("Enter the length of third side");
		side3=input.nextDouble();
		perimeter=side1+side2+side3;
		rounds=5000/perimeter;
		System.out.println("The total number of rounds the athlete will run is "+rounds+" to complete 5 km");
	}
}