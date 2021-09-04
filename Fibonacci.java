package Week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum =0;
		int secondNum =1;
		System.out.println(firstNum);
		System.out.println(secondNum);
		int sum;
		for (int i = 1; i <=6; i++) {
			
			sum=firstNum+secondNum;
			System.out.println("" +sum);
			firstNum =secondNum;
			secondNum=sum;
			
		}
		
	}

}
