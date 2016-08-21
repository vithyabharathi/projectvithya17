import java.io.*;
import java.util.*;
class odd
{
	public static void main(String args[])
	{
		int n1;
		int n2;
		Scanner scr=new Scanner(System.in);
		n1=scr.nextInt();
		n2=scr.nextInt();
		for(int i=n1;i<=n2;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
		
	}
}
