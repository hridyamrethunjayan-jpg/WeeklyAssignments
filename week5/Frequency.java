import java.util.Scanner;
public class Frequency{
	public static void main(String[] args){
		Scanner in=new scanner(System.in);
		int number;
		System.out.println("Enter a number");
		number=in.nextInt();
		int temp=number;
		int count=0;
		while (temp>0){
			temp/=10;
			count++;
		}
		int[] digits=new int[count];
		temp=number;
		for(int i=0;i<count;i++){
			digits[i]=temp%10;
			temp=temp/10;
		}
		int[] freq=new int[10];
		for(int i=o;i<count;i++){
			freq[digits[i]]++;
		}
		System.out.println("Frequencies: ");
		for(int i=0;i<10;i++){
			if (freq[i]>0){
				System.out.println(i+"-"+freq[i]);
			}
		}
	}
}						