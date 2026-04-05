import java.util.Scanner;
public class YoungestTallest{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int age1,age2,age3;
		double height1,height2,height3;
		System.out.println("Enter Amar's age");
		age1=in.nextInt();
		System.out.println("Enter Akbar's age");
		age2=in.nextInt();
		System.out.println("Enter Anthony's age");
		age3=in.nextInt();
		System.out.println("Enter Amar's height");
		height1=in.nextDouble();
		System.out.println("Enter Akbar's height");
		height2=in.nextDouble();
		System.out.println("Enter Anthony's height");
		height3=in.nextDouble();
		if (age1<age2 && age1<age3)
			System.out.println("Amar is youngest");
		else if (age2<age3 && age2<age1)
			System.out.println("Akbar is youngest");
		else
			System.out.println("Anthony is youngest");
		if (height1>height2 && height1>height3)
			System.out.println("Amar is tallest");
		else if (height2>height1 && height2>height3)
			System.out.println("Akbar is tallest");
		else
			System.out.println("Anthony is tallest");
	}
}	