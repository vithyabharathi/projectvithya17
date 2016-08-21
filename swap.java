import java.io.*;
import java.util.*;
class swap
{
	public static void main(String args[])
	{
	int a;
	int b;
	Scanner scr=new Scanner(System.in);
	a=scr.nextInt();
	b=scr.nextInt();
	int t;
	t=a;
	a=b;
	b=t;
	System.out.println(a);
	System.out.println(b);
	}
}
