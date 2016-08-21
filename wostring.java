import java.io.*;
import java.util.*;
class wostring
{
	public static void main(String args[])
	{
		String s1;
		String s2;
		Scanner scr=new Scanner(System.in);
		s1=scr.next();
		s2=scr.next();
		if(s1.equals(s2))
		{
			System.out.println("The given strings are equal");
		}
		else
		{
			System.out.println("The given strings are not equal");
		}
	}
}
