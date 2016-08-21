import java.io.*;
import java.util.*;
class  stringdup
{
	public static void main(String args[])
	{
		String s;
		Scanner scr=new Scanner(System.in);
		s=scr.next();
		char cc[]=s.toCharArray();
		Set <String> ss=new LinkedHashSet<String>();
		for(int i=0;i<s.length();i++)
		{
			ss.add(String.valueOf(cc[i]));
		}
		System.out.println(ss);
	}
}
