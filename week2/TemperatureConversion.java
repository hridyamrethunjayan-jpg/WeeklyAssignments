import java.util.Scanner;
public class TemperatureConversion{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double celsius, fahrenheitResult;
		System.out.println("Enter the temperature in celsius");
		celsius=input.nextDouble();
		fahrenheitResult=(celsius*9/5)+32;
		System.out.println("The "+celsius+" celsius is "+fahrenheitResult+" fahrenheit");
	}
}