import java.util.Scanner;
public class Handshakes{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int noOfStudents, handshakes;
		System.out.println("Enter number of students");
		noOfStudents=input.nextInt();
		handshakes=(noOfStudents*(noOfStudents-1))/2;
		System.out.println("The number of handshakes is "+handshakes);
	}
}
