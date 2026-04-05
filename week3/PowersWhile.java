import java.util.Scanner;
public class PowersWhile{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int number,power;
		System.out.println("Enter the number");
		number=in.nextInt();
		System.out.println("Enter the power");
		power=in.nextInt();
		int result=1;
		if(power>=0){
			int i=1;
			while(i<=power){
				result=result*number;
				i++;
			}
			System.out.println("The result is "+result);
		}else
			System.out.println("Enter non-negative power");
	}
}