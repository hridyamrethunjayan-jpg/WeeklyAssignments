import java.util.Scanner;
public class Factor{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int number;
		System.out.println("Enter the number");
		number=in.nextInt();
		if(number>0){
			System.out.println("The factors of "+number+" are:" );
			for(int i=1;i<number;i++){
				if(number%i==0)
					System.out.println(i);
			}
		}else
			System.out.println("Enter a positive integer");
	}
}			