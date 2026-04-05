import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double first,second,result;
        String op;
		System.out.println("Enter the first number");
        first=in.nextDouble();
		System.out.println("Enter the second number");
        second=in.nextDouble();
		System.out.println("Enter the operator");
        op=in.next();
        switch(op){
            case "+":
                result=first+second;
                System.out.println(result);
                break;
            case "-":
                result=first-second;
                System.out.println(result);
                break;
            case "*":
                result=first*second;
                System.out.println(result);
                break;
            case "/":
                if(second!=0){
                    result=first/second;
                    System.out.println(result);
                }else{
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}