import java.util.Scanner;
public class MultiTable{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int number;
		System.out.println("Enter the number");
		number=in.nextInt();
		for(int i=6;i<=9;i++){
			System.out.println(number+" * "+i+" = "+(number*i));
		}
	}
}		