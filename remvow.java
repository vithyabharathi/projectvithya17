import java.io.*;
import java.util.*;
class  remvow
{
	public static void main(String args[])
	{
		String s;
		Scanner scr=new Scanner(System.in);
		s=scr.next();
		StringBuffer sb=new StringBuffer(s);
		String ss=sb.reverse().toString();
		System.out.println(ss);
		char c[]=ss.toCharArray();
		int l=s.length();
		char v[]={'a','e','i','o','u'};
		String r="";
		boolean b=false;
		for(int i=0;i<l;i++)
		{ 
			b=false;
			for(int j=0;j<5;j++)
			{
				if(c[i]==v[j])
				{
					b=true;
					break;
				}
			}
			if(!b)
			{
				r+=String.valueOf(c[i]);
			}
		}
		System.out.println(r);
	}
}
