import java.util.Scanner;
public class MeanHeight{
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	double sum=0;
	double mean;
	double[] heights=new double[11];
	System.out.println("Enter the heights of 11 people");
	for(int i=0;i<11;i++){
		heights[i]=in.nextDouble();
		sum+=heights[i];
		}
	mean=sum/11;
	System.out.println("The mean height is "+mean);
	}
}