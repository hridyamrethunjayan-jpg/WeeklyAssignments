import java.util.Scanner;
public class TotalPrice{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int quantity;
		double unitPrice, totalPrice;
		System.out.println("Enter the unit price of the item");
		unitPrice=input.nextDouble();
		System.out.println("Enter the quantity to be bought");
		quantity=input.nextInt();
		totalPrice=unitPrice*quantity;
		System.out.println("The total price is "+totalPrice);
	}
}	