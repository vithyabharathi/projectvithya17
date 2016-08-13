import java.io.*;
import java.util.*;
class rev
{
	public static void main(String args[])
	{
     String s;
     Scanner scr=new Scanner(System.in);
     s=scr.nextLine();
     if(s.length()>1)
     {
     StringBuffer sb=new StringBuffer(s);
     System.out.println(sb.reverse());
     }
     else
     {
     	System.out.println("not given enough string to reverse");
     }
	}
}
