import java.util.Scanner;
public class StudentGrades{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int students;
		System.out.println("Enter the number of students");
		students=in.nextInt();
		int[] phy=new int[students];
		int[] chem=new int[students];
		int[] math=new int[students];
		double[] percent=new double[students];
		char[] grades=new char[students];
		String[] remarks=new String[students];
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