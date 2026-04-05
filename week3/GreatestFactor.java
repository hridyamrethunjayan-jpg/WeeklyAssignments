import java.util.Scanner;
public class GreatestFactor{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int variable;
		System.out.println("Enter the number");
		variable=in.nextInt();
		int greatestfactor=1;
		if(variable>0){
			for(int i=variable-1;i>=1;i--){
				if(variable%i==0){
					greatestfactor=i;
					break;
				}
			}
		System.out.println("The greatest factor is "+greatestfactor);
	}else
			System.out.println("Enter positive number");
	}
}