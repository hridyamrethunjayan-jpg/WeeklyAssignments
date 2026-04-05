import java.util.Scanner;
public class HarshadNumber{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number,original,digit;
		System.out.println("Enter the number");
        number=in.nextInt();
		int sum=0;
        original=number;
        while(number!=0){
            digit=number%10;
            sum=sum+digit;
            number=number/10;
        }
        if(original%sum==0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not a Harshad Number");
    }
}