//Command line argument

import java.lang.*;
class Demo2
{
	public static void main(String args[])
	{
		for(int i=0;i<args.length;i++)
		{
			System.out.println("Command line arguments are"+args[i]);
		}
		
	}
}

for(int i=0;i<args.length;i++)
{
	System.out.println(args[i]);
}