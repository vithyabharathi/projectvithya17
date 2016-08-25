import java.io.*;
import java.util.*;
class strsetrev
{
public static void main(String args[])
{
String s;
Scanner scr=new Scanner(System.in);
s=scr.next();
StringBuffer sb=new StringBuffer(s);
sb=sb.reverse();
String str=new String(sb);
char a[]=str.toCharArray();
int l=str.length();
Set <String> ss=new LinkedHashSet <String>();
for(int i=0;i<l;i++)
{
ss.add(String.valueOf(a[i]));
}
Iterator it=ss.iterator();
while(it.hasNext())
{
System.out.print(it.next());
}
}
}
