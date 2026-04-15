import java.util.Scanner;
public class BMI{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number of persons");
		int persons=in.nextInt();
		double[] weight=new double[persons];
		double[] height=new double[persons];
		double[] bmi=new double[persons];
		String[] status=new String[persons];
		for(int i=0;i<persons;i++){
			System.out.println("Person "+(i+1));
			System.out.println("Enter the weight ");
			weight[i]=in.nextDouble();
			System.out.println("Enter the height");
			height[i]=in.nextDouble();
			if(weight[i]<=0||height[i]<=0){
				System.out.println("Invalid input. Enter again.");
				i--;
				continue;
			}
			bmi[i]=weight[i]/(height[i]*height[i]);
			if(bmi<=18.4)
                status[i] = "Underweight";
            else if (bmi>=18.5&&bmi<=24.9)
                status[i] = "Normal";
            else if (bmi>=25 && bmi<=39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }
        System.out.println("Result: ");
        for (int i = 0; i < persons; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight: " + weight[i]);
            System.out.println("Height: " + height[i]);
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Status: " + status[i]);
        }
	}
}		