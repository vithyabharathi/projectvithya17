import java.io.*;
import java.util.*;
class alpha
{
	public static void main(String args[])
	{
      char c;
      Scanner scr=new Scanner(System.in);
      c=scr.next().charAt(0);
      if(Character.isAlphabetic(c))
      {
      	System.out.println("alphabet");
      }
      else
      {
      	System.out.println("not an alphabet");
      }
	}
}
