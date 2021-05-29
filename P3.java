//User definrd exception

import java.lang.*;
import java.util.*;

class AgeInvalid extends Exception
{
	public AgeInvalid(String str)
	{
		super(str);
	}
}

class P3
{
	public static void main(String args[])
	{
		int age=15;
		try
		{
			if(age<18)
			{
				throw new AgeInvalid("age is less than 18");
			}
		}
		catch(AgeInvalid ret)
		{
			System.out.println(ret);
		}
	}
}