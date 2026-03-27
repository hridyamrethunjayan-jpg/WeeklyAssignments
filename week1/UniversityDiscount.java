import java.util.Scanner;
public class UniversityDiscount{
	public static void main(String args[]){
		int fees;
		double discountPercent,discount,discountedFees;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the fees");
		fees=input.nextInt();
		System.out.println("Enter the discount percentage");
		discountPercent=input.nextDouble();
		discount=fees*(discountPercent/100);
		discountedFees=fees-discount;
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+discountedFees);
	}
}