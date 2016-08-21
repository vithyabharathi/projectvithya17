import java.io.*;
import java.util.*;
class numpali
{
	public static void main(String args[])
	{
		int n;
		Scanner scr=new Scanner(System.in);
		n=scr.nextInt();
		String s=String.valueOf(n);
		StringBuffer sb=new StringBuffer(s);
		StringBuffer sb1=sb.reverse();
		String s1=sb1.toString();
		if(s.equals(s1))
		{
			System.out.println("The given number is palindrome");
		}
		else
		{
			System.out.println("The given number is not a palindrome");
		}
	}
}
