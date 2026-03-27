import java.util.Scanner;
public class TriangleArea{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		double base, height, areacm, areainches;
		System.out.println("Enter base");
		base=input.nextDouble();
		System.out.println("Enter height");
		height=input.nextDouble();
		areacm=0.5*base*height;
		areainches=areacm/(2.54*2.54);
		System.out.println("The area of the triangle in square inches is "+areainches+" and squre cm is "+areacm);
	}
}