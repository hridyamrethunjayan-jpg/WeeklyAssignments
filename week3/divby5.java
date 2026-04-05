import java.util.Scanner;
public class divby5{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int number;
		System.out.println("Enter the number");
		number=in.nextInt();
		boolean result=(number%5==0);
		System.out.println("Is the number "+number+" divisible by 5? "+result);
	}
}