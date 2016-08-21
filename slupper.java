import java.io.*;
import java.util.*;
class slupper
{
	public static void main(String args[])
	{
		String s;
		Scanner scr=new Scanner(System.in);
        s=scr.next();
        int l=s.length();
        char cc[]=s.toCharArray();
        cc[1]=Character.toUpperCase(cc[1]);
       for(int i=0;i<l;i++)
       {
       	System.out.print(cc[i]);
       }
	}
}
