package sebone;
import java.util.Arrays;
import java.util.Scanner;

public class anagram 
{
	    public void checkAnagram(String s1,String s2)
	    {
	     s1.replaceAll("//s", "");
	     s2.replaceAll("//s", "");
	    char[]c1=s1.toLowerCase().toCharArray();
	    char[]c2=s2.toLowerCase().toCharArray();
	    Arrays.sort(c1);
	    Arrays.sort(c2);
	    boolean check=Arrays.equals(c1,c2);
	    if(check) 
	    {
	    System.out.println("String is Anagram");
	    }
	    else
	    System.out.println("String is Not Anagram");
	    }
	public static void main(String[] args)
	{
	anagram s=new anagram();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first string");
	    String s1=sc.next();
	    System.out.println("Enter second string");
	    String s2=sc.next();
	    s.checkAnagram(s1,s2);
	   
	    sc.close();
	   
	}
}

