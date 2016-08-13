import java.io.*;
import java.util.*;
class vowel
{
	public static void main(String args[])
	{
         char c;
         Scanner scr=new Scanner(System.in);
         c=scr.next().charAt(0);
         String ss="aeiou";
         int n=ss.length();
         char vow[]=ss.toCharArray();
         for(int i=0;i<n;i++)
         {
         	if(vow[i]==c)
         	{
         		System.out.println("Vowel");
         		break;
         	}
         	else
         	{
         		System.out.println("Consonant");
         		break;
         	}
         }
	}
}
