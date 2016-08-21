import java.io.*;
import java.util.*;
class revodd
{
	public static void main(String args[])
	{
		String s;
		Scanner scr=new Scanner(System.in);
        s=scr.nextLine();
        String str[]=s.split(" ");
        for(int i=0;i<str.length;i++)
        {
        	if(i%2==0)
        	{
        		StringBuffer sb=new StringBuffer(str[i]);
        		StringBuffer ssb=sb.reverse();
        		System.out.print(ssb);
        		System.out.print(" ");
        	}
        	else
        	{
        		System.out.print(str[i]);
        		System.out.print(" ");
        	}
        }
	}
}
