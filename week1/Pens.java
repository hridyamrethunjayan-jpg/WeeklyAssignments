public class Pens{
	public static void main(String args[]){
		int pens=14, students=3;
		int distributedEqually=pens/students;
		int remainingPens=pens%students;
		System.out.println("The Pen Per Student is "+distributedEqually+" and the remaining pen not distributed is "+remainingPens);
	}
}
