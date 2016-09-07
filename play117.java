import java.io.*;
import java.util.*;
class play117 {
public static void main(String args[])
{
	String s;
	Scanner scr=new Scanner(System.in);
	s=scr.next();
	StringBuffer sb=new StringBuffer(s);
	String str=new String(sb.reverse());
	char a[]=str.toCharArray();
	for(int i=0;i<str.length();i++)
	{
		System.out.print(a[i]+"-");
	}
}
}
