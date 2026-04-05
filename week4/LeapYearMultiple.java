import java.util.Scanner;
public class LeapYearMultiple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int year;
        System.out.print("Enter a year: ");
        year = in.nextInt();
        if (year < 1582) {
            System.out.println("Enter a year >= 1582");
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("Leap Year");
                    } else {
                        System.out.println("Not a Leap Year");
                    }
                } else {
                    System.out.println("Leap Year");
                }
            } else {
                System.out.println("Not a Leap Year");
            }
        }
    }
}