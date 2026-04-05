import java.util.Scanner;
public class Multiples{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int number;
		System.out.println("Enter the number");
		number=in.nextInt();
		if(number>0 && number<100){
			System.out.println("Multiples of "+number+" below 100 are");
			for(int i=100;i>=1;i--){
				if(i%number==0)
					System.out.println(i);
				continue;
			}
		}else
			System.out.println("Enter positive number less than 100");
	}
}