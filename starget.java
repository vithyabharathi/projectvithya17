import java.io.*;
import java.util.*;
class starget
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
       int tar;
       tar=scr.nextInt();
       int t=0;
       for(int i=0;i<n;i++)
       {
       	for(int j=i+1;j<n;j++)
       	{
       		if(a[i]+a[j]==tar)
       		{
       			System.out.println(a[i]+" "+a[j]);
       		}
       		else
       		{
       			t=1;
       		}
       	}
       }
       if(t==1)
       {
       	System.out.println("No numbers found");
       }
	}
}
