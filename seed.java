import java.io.*;
import java.util.*;
class seed
{
public static void main(String args[])
{
int n;
Scanner scr=new Scanner(System.in);
n=scr.nextInt();
String s=String.valueOf(n);
int l=s.length();
String str[]=s.split("");
int x=1;
for(int i=0;i<l;i++)
{
char c=s.charAt(i);
x*=Integer.parseInt(String.valueOf(c));
}
System.out.println(x*n);
}
}
