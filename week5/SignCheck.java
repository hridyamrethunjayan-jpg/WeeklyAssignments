import java.util.Scanner;
public class SignCheck{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Enter the numbers");
		for(int i=0;i<arr.length;i++)
			arr[i]=in.nextInt();
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0){
				if(arr[i]%2==0)
					System.out.println(arr[i]+" is even");
				else
					System.out.println(arr[i]+" is odd");
			}else if (arr[i]<0)
				System.out.println(arr[i]+" is negative");
			else
				System.out.println(arr[i]+" is zero");
			}
			if(arr[0]==arr[arr.length-1])
				System.out.println("The first element is equal to last element");
			else if(arr[0]<arr[arr.length-1])
				System.out.println("The first element is less than last element");
			else
				System.out.println("The first element is greater than last element");
	}
}