import java.util.Scanner;
public class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        System.out.print("Enter the number");
        int n = in.nextInt();
        while (i <= n) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
            i++;
        }
    }
}