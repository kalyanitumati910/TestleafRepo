package week1day1;

public class Isprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int num= 7;
		
		for(int i=2; i < num-1; i++)
		{
			if (num%i==0)
			{
				System.out.println("Given num "+num+" is a prime number");
			}
			else
			{
				System.out.println("Given num "+num+" is not a prime number");
			}
		}
				
				
	}

}
