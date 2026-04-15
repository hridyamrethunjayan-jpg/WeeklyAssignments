import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int[] arr=new int[10];
		int number;
		System.out.println("Enter the number");
		number=in.nextInt();
		for(int i=1;i<=10;i++){
			arr[i-1]=number*i;
			System.out.println(number+" * "+i+" = "+arr[i-1]);
		}
	}
}