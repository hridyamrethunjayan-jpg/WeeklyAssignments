import java.util.Scanner;

public class BMI{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double weight,height,bmi;
		System.out.println("Enter the weight");
        weight=in.nextDouble();
		System.out.println("Enter the height");
        height=in.nextDouble()/100;
        bmi=weight/(height*height);
        System.out.println("BMI: "+bmi);
        if(bmi<=18.4)
			System.out.println("Underweight");
        else if(bmi<=24.9)
			System.out.println("Normal");
        else if(bmi<=39.9)
			System.out.println("Overweight");
        else 
			System.out.println("Obese");
    }
}