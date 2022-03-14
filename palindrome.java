package sebone;
import java.util.Scanner;

public class palindrome
{
	public static
	boolean isPalindrome(int num) 
	{
		  int sum=0,temp;
			temp=num;
			
			while(num>0)
			{
				
				sum=sum*10+(num%10);
				num=num/10;
			}
			return sum==temp;
				
	}
		
		public static void main(String[] args)
		{
			System.out.println("Enter any no");
	     Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
		 if(isPalindrome(n))
			 System.out.println(n+" is palindrome");
		 else
			 System.out.println(n+" is not a palindrome");
	     sc.close();
	    }
}