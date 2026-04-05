import java.util.Scanner;
public class OddOrEven{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int number;
		System.out.println("Enter the number upto which the numbers should be displayed");
		number=in.nextInt();
		if(number>0){
			for(int i=1;i<=number;i++){
				if(i%2==0){
					System.out.println(i+" is even");
				}else{
					System.out.println(i+" is odd");
				}
			}
		}else{
			System.out.println("Enter a natural number");
		}
	}
}		