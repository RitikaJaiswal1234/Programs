package sebone;

import java.util.Scanner;

public class prime 
{
	
	    public void findPrime(int n) 
	    {
	    for(int i=0;i<n;i++) 
	    {
	        if(i==0||i==1) 
	        continue;
	        int flag=1;
	        for(int j=2;j<=i/2;j++)
	        {
	          if(i%j==0)
	         {
	           flag=0;
	           break;
	         }
	        }
	        if(flag==1)
	        
	        System.out.println(i);
	        
	    }
	    }
	public static void main(String[] args) 
	{
	        Scanner sc=new Scanner(System.in);
	        prime p=new prime();
	        System.out.print("Enter any numer = ");
	        int n=sc.nextInt();
	        p.findPrime(n);
	        sc.close();
	}

	}

