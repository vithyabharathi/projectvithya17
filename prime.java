import java.io.*;
import java.util.*;
class prime
{
	public static void main(String args[])
	{
		int n;
		Scanner scr=new Scanner(System.in);
		n=scr.nextInt();
	    int m=n/2;
	    boolean b=true;
	    for(int i=2;i<m;i++)
	    {
	    	if(n%i==0)
	    	{
	    		b=false;
	    		break;
	    	}
	    }
	    if(b)
	    {
	    	System.out.println("The given number is prime number");
	    }
	    else
	    {
	    	System.out.println("The given number is not a prime number");
	    }
	}
}
