import java.util.Scanner;
public class FactorWhile{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int number;
		System.out.println("Enter the number");
		number=in.nextInt();
		if(number>0){
			System.out.println("The factors of "+number+" are:" );
			int i=1;
			while(i<number){
				if(number%i==0)
					System.out.println(i);
				i++;
			}
		}else
			System.out.println("Enter a positive integer");
	}
}			