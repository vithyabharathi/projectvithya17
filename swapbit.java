import java.io.*;
import java.util.*;
class swapbit
{
	public static void main(String args[])
	{
	int a;
	int b;
	Scanner scr=new Scanner(System.in);
	a=scr.nextInt();
	b=scr.nextInt();
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println(a);
	System.out.println(b);
	}
}
