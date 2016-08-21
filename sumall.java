import java.io.*;
import java.util.*;
class sumall
{
	public static void main(String args[])
	{
		int n;
		Scanner scr=new Scanner(System.in);
		n=scr.nextInt();
		int r=0;
		for(int i=1;i<=n;i++)
		{
			r+=i;
		}
		System.out.println(r);
	}
}
