import java.util.Scanner;
public class Grade{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		double phy,chem,maths;
		System.out.println("Enter Physics Marks out of 100");
		phy=in.nextDouble();
		System.out.println("Enter Chemistry Marks out of 100");
		chem=in.nextDouble();
		System.out.println("Enter Maths Marks out of 100");
		maths=in.nextDouble();
		double average,percentage;
		average=(phy+chem+maths)/3;
		percentage=average*100;
		System.out.println("Average marks: "+average);
		if(percentage>=80){
			System.out.println("Grade: A");
			System.out.println("Remarks: Level 4, above agency-normalized standards");
		}else if(percentage>=70 && percentage<=79){
			System.out.println("Grade: B");
			System.out.println("Remarks: Level 3, at agency-normalized standards");
		}else if(percentage>=60 && percentage<=69){
			System.out.println("Grade: C");
			System.out.println("Remarks: Level 2,below, but approaching agency-normalized standards");
		}else if(percentage>=50 && percentage<=59){
			System.out.println("Grade: D");
			System.out.println("Remarks: Level 1, well below agency-normalized standards");
		}else if(percentage>=40 && percentage<=49){
			System.out.println("Grade: E");
			System.out.println("Remarks: Level 1-, too below agency-normalized standards");
		}else{
			System.out.println("Grade: R");
			System.out.println("Remarks: Remedial standards");
		}
	}
}