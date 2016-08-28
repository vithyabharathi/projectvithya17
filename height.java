import java.io.*;
import java.util.*;
class height
{
	public static void main(String args[])
	{
		int a[]=new int[50];
		Scanner scr=new Scanner(System.in);
		for(int i=0;i<50;i++)
		{
			a[i]=scr.nextInt();
		}
		int r=scr.nextInt();
		for(int j=0;j<50;j++)
		{
			for(int k=j+1;k<50;k++)
			{
				if(a[j]<a[k])
				{
					int t=a[j];
					a[j]=a[k];
					a[k]=t;
				}
			}
		}
      System.out.println(a[3]);
      System.out.println(a[r]);
	}
}
