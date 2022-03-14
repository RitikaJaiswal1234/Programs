package sebone;
import java.util.Scanner;

public class occurence 
{

 public int countOccurance(String s,String w)
 {
	   String a[] = s.split(" ");
    int count=0;
    for(int i=0;i<a.length;i++)
    {
       if(a[i].equals(w))
         count++;
    }
    return count;
 }
 public static void main(String[]args)
 {
   Scanner sc=new Scanner(System.in);
   occurence o=new occurence();
   System.out.println("Enter any String");
   String s=sc.nextLine();
   System.out.println("Enter word");
   String w=sc.next();
   System.out.println("Occurance of a in given string is = "+o.countOccurance(s,w));
   sc.close();
 }
}



