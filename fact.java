import java.io.*;
import java.util.*;
class fact
{
	public static void main(String args[])
	{
		int n;
		Scanner scr=new Scanner(System.in);
		n=scr.nextInt();
		if(n>0)
		{
		int r=1;
		for(int i=1;i<=n;i++)
		{
			r*=i;
		}
		System.out.println(r);
		}
		else
		{
			System.out.println("factorial cannot be found");
		}
	}
}
