import java.io.*;
import java.util.*;
class play108
{
public static void main(String args[])
{
	String s;
	Scanner scr=new Scanner(System.in);
	s=scr.next();
	char a[]=s.toCharArray();
	Map <Character,Integer> mm=new LinkedHashMap <Character,Integer>();
	for(int i=0;i<s.length();i++)
	{
	mm.put(a[i],mm.get(a[i])==null?1:mm.get(a[i])+1);
	}
	int count=0;
	List <Character> ll=new ArrayList <Character> (mm.keySet());
	for(char r:ll)
	{
	if(mm.get(r)==1)
	{
	count++;
	}
	}
	System.out.println(count);
}
}
