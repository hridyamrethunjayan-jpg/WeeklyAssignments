import java.util.Scanner;
public class GreatestFactorWhile{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int variable;
		System.out.println("Enter the number");
		variable=in.nextInt();
		int greatestfactor=1;
		if(variable>0){
			int counter=variable-1;
			while(counter>=1){
				if(variable%counter==0){
					greatestfactor=counter;
					break;
				}
			counter--;
			}
		System.out.println("The greatest factor is "+greatestfactor);
	}else
			System.out.println("Enter positive number");
	}
}