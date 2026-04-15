import java.util.Scanner;
public class BMI2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int persons = in.nextInt();
        double[][] personData = new double[n][3];
        String[] status = new String[n];
        for (int i = 0; i < persons; i++) {
            System.out.println("Person " + (i + 1));
            System.out.print("Enter weight: ");
            personData[i][0] =in.nextDouble();
            System.out.print("Enter height: ");
            personData[i][1] = in.nextDouble();
            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid input! Enter again.");
                i--;
                continue;
            }
            double weight = personData[i][0];
            double height = personData[i][1];
            personData[i][2] = weight / (height * height);
            double bmi = personData[i][2];
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
            System.out.println("Weight: " + personData[i][0]);
            System.out.println("Height: " + personData[i][1]);
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + status[i]);
        }
	}
}		