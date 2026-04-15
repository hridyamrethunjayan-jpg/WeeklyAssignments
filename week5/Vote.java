import java.util.Scanner;
public class Vote{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int[] arr=new int[10];
		System.out.println("Enter the age of 10 students one by one");
		for(int i=0;i<arr.length;i++)
			arr[i]=in.nextInt();
		for(int i=0;i<arr.length;i++){
			if(arr[i]<0)
				System.out.println("Invalid age");
			else{
				if(arr[i]>=18)
					System.out.println("The student with the age "+arr[i]+" can vote");
				else
					System.out.println("The student with age "+arr[i]+" cannot vote");
			}
		}
	}
}