import java.util.Scanner;
public class KilometersToMilesConverter{
	public static void main(String args[]){
		double km,miles;
		Scanner input=new Scanner(System.in);
		km=input.nextDouble();
		miles=km*0.625;
		System.out.println("The total miles is"+miles+" miles for the given "+km+" km");
	}
}