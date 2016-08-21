import java.io.*;
import java.util.*;
class secondarray
{
	public static void main(String args[])
	{
		int n;
		Scanner scr=new Scanner(System.in);
		n=scr.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=scr.nextInt();
		}
		int t=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
				}
			}
		}
	System.out.println(a[n-2]);
	}
}
