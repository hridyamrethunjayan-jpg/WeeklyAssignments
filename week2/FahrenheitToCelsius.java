import java.util.Scanner;
public class FahrenheitToCelsius{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double celsiusResult, fahrenheit;
		System.out.println("Enter the temperature in fahrenheit");
		fahrenheit=input.nextDouble();
		celsiusResult=(fahrenheit-32)*5/9;
		System.out.println("The "+fahrenheit+" fahrenheit is "+celsiusResult+" celsius");
	}
}