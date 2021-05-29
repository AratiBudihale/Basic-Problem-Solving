
//Generic programming

import java.lang.*;

interface Hello<T>
{
	T fun(T no1,T no2);
}

class Demo<T> implements Hello<T>
{
	public T fun(T no1,T no2)
	{
		return no1;
	}
}

class Generic_Interface
{
	public static void main(String args[])
	{
		Demo<Integer> obj=new Demo<Integer>();
		Integer ret=obj.fun(10,20);
		System.out.println(ret);
	}
}