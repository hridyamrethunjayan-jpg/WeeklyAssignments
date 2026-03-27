import java.util.Scanner;
public class TotalIncome{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double salary, bonus, income;
		System.out.println("Enter salary");
		salary=input.nextDouble();
		System.out.println("Enter bonus");
		bonus=input.nextDouble();
		income=salary+bonus;
		System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+". Hence Total Income is INR "+income);
	}
}