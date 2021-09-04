package Week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5;
		boolean flag = false;
		for (int i=2; i<num; i++) 
		{
			if (num%i == 0) 
			{
				flag = true;
				break;

			}
		}
		if (flag==true) 
		{
			System.out.println("the number is not a Prime number");
			
		} 
		else 
		{
			System.out.println("the number is a Prime number");

		}
		
	}

}
