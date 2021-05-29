
import java.lang.*;
import java.io.*;

class Demo
{
	public void fun()throws IOException//CheckedException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name");
		String str=br.readLine();
		
	}
}
class P4
{
	public static void main(String args[])
	{
		Demo obj=new Demo();
		try
		{
			obj.fun();
		}
		catch(Exception ref)
		{
			System.out.println("Inside catch");
		}
	}
}