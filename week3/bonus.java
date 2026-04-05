import java.util.Scanner;
public class bonus{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		double salary, yearOfService, bonus;
		System.out.println("Enter the salary");
		salary=in.nextDouble();
		System.out.println("Enter the number of years of service");
		yearOfService=in.nextDouble();
		if (yearOfService>5.0){
			bonus=0.05*salary;
			salary=salary+bonus;
			System.out.println("The bonus amount is "+bonus+" and salary is "+salary);
		}else{
			System.out.println("No bonus applicable");
		}
	}
}		