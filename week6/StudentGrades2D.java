import java.util.Scanner;
public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        int[][] marks = new int[n][3]; // 2D array
        double[] percent = new double[n];
        char[] grades = new char[n];
        String[] remarks = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.print("Enter Physics: ");
            marks[i][0] = in.nextInt();
            System.out.print("Enter Chemistry: ");
            marks[i][1] = in.nextInt();
            System.out.print("Enter Maths: ");
            marks[i][2] = in.nextInt();
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid input. Enter again.");
                i--;
                continue;
            }
            for(int i=0;i<students;i++){
			System.out.println("Student: "+(i+1));
			System.out.println("Enter Physics Marks");
			phy[i]=in.nextInt();
			System.out.println("Enter Chemistry Marks");
			chem[i]=in.nextInt();
			System.out.println("Enter Maths Marks");
			math[i]=in.nextInt();
			if(phy[i]<0||chem[i]<0||math[i]<0){
				System.out.println("Marks cannot be negative. Enter marks again");
				i--;
				continue;
			}
			percent[i]=(phy[i]+chem[i]+math[i])/3.0;
			if(percent[i]>=80){
				grades[i]='A';
				remarks[i]="Level 4, Above agency-normalized standards";
			}else if(percent[i]>=70 && percent[i]<80){
				grades[i]='B';
				remarks[i]="Level 3, at agency-normalized standards";
			}else if(percent[i]>=60 && percent[i]<70){
				grades[i]='C';
				remarks[i]="Level 2, below but approaching standards"
			}else if(percent[i]>=50 && percent[i]<60){
				grades[i]='D';
				remarks[i]="Level 1, well below approaching standards"
			}else if(percent[i]>=40 && percent[i]<50){
				grades[i]='E';
				remarks[i]="Level 1-, too below standards"
			}else{
				grades[i]='R';
				remarks[i]="Remedial standards";
			}
		}
		System.out.println("Result:");
		for(int i=0;i<students;i++){
			System.out.println("Student "+(i+1));
			System.out.println("Percentage "+percent[i]);
			System.out.println("Grade "+grades[i]));
			System.out.println("Remarks "+remarks[i]);
		}
	}
}