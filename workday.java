import java.io.*;
import java.util.*;
class workday
{
	public static void main(String args[])
	{
		String s;
		Scanner scr=new Scanner(System.in);
		s=scr.next();
		if(s.equalsIgnoreCase("sunday"))
		{
			System.out.println("false");
		}
		else
		{
			System.out.println("true");
		}
	}
}
