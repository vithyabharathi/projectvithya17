import java.io.*;
import java.util.*;
class positive
{
public static void main(String args[])
{
int number;
Scanner scr=new Scanner(System.in);
number=scr.nextInt();
if(number>0)
{
System.out.println("positive");
}
else if(number==0)
{
System.out.println("zero");
}
else
{
System.out.println("negative");
}
}
}
