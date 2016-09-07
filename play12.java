import java.io.*;
import java.util.*;
class play12 {
public static void main(String args[])
{
	int n;
	Scanner scr=new Scanner(System.in);
	n=scr.nextInt();
	int a[]=new int[n];
	int k=scr.nextInt();
	ArrayList <Integer> al=new ArrayList <Integer>();
	for(int i=0;i<n;i++)
	{
		a[i]=scr.nextInt();
		al.add(a[i]);
	}
	Collections.rotate(al,k);
	System.out.println(al);
}
}
