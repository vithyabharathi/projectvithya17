import java.io.*;
import java.util.*;
class smallele
{
public static void main(String args[])
{
int n;
Scanner scr=new Scanner(System.in);
n=scr.nextInt();
int a[]=new int[n];
int b[]=new int[n];
int y=0;
for(int i=0;i<n;i++)
{
a[i]=scr.nextInt();
}
for(int j=0;j<n;j++)
{
int k=j+1;
if(k<n)
{
if(a[j]>a[k])
{
b[y++]=a[k];
}
else
{
b[y++]=-1;
}
}
}
b[y++]=-1;
for(int o=0;o<y;o++)
{
System.out.println(b[o]);
}
}
}
