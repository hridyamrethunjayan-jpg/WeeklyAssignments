import java.util.Scanner;
public class sum{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int number, sum;
		System.out.println("Enter the number");
		number=in.nextInt();
		if(number>0){
			sum=(number*(number+1))/2;
			System.out.println("The sum of "+number+" natural numbers is "+sum);
		}else{
			System.out.println("The number "+number+" is not a natural number");
		}
	}
}	