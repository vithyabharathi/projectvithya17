import java.io.*;
import java.util.*;
class play115 
{
public static void main(String args[])
{
	int n;
	Scanner scr=new Scanner(System.in);
	n=scr.nextInt();
	String s=String.valueOf(n);
	char a[]=s.toCharArray();
	String s1="";
	int res=0;
	for(int i=0;i<s.length();i++)
	{
		String str=String.valueOf(a[i]);
		int r=Integer.parseInt(str);
		res+=r*r;
	}
		System.out.println(res);
}
}
