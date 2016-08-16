import java.io.*;
import java.util.*;
class revint
{
	public static void main(String args[])
	{
		int n;
		Scanner scr=new Scanner(System.in);
		n=scr.nextInt();
		String s=String.valueOf(n);
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
	}
}
