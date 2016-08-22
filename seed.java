import java.io.*;
import java.util.*;
class seed
{
public static void main(String args[])
{
int n;
Scanner scr=new Scanner(System.in);
n=scr.nextInt();
int n2;
n2=scr.nextInt();
String s=String.valueOf(n);
int l=s.length();
String str[]=s.split("");
int x=1;
for(int i=0;i<l;i++)
{
char c=s.charAt(i);
x*=Integer.parseInt(String.valueOf(c));
}
int z=x*n;
if(n2==z)
{
System.out.println("The given number is a seed number");
}
else
{
System.out.println("The given number is a seed number");
}
}
}
