import java.io.*;
import java.util.*;
class addfl
{
	public static void main(String args[])
	{
		int n;
		Scanner scr=new Scanner(System.in);
		n=scr.nextInt();
		String s=String.valueOf(n);
		int l=s.length();
		String f=String.valueOf(s.charAt(0));
		String la=String.valueOf(s.charAt(l-1));
		int r=Integer.parseInt(f)+Integer.parseInt(la);
		System.out.println(r);
	}
}
