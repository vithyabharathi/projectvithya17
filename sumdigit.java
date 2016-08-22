import java.io.*;
import java.util.*;
class sumdigit
{
public static void main(String args[])
{
int n;
Scanner scr=new Scanner(System.in);
n=scr.nextInt();
String s=String.valueOf(n);
String str[]=s.split("");
int l=s.length();
String r="";
for(int i=l;i>=0;i--)
{
for(int j=i;j>=0;j--)
{
r+=str[j];
}
}
int l2=r.length();
int x=0;
for(int k=0;k<l2;k++)
{
char c=r.charAt(k);
x+=Integer.parseInt(String.valueOf(c));
}
System.out.println(x);
}
}
