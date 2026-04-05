import java.util.Scanner;
public class Digits{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
		int number;
        System.out.print("Enter a number ");
        number = in.nextInt();
        int count = 0;
        if (number == 0)
            count = 1;
        else{
            while (number != 0){
                number = number/10;
                count++;
            }
        }
        System.out.println("Number of digits = " + count);
    }
}