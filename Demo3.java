
import java.lang.*;
class Demo3
{
	public static void main(String args[])
	{
		int arr[]=new int[5];
		
		System.out.println(arr.length);
		
		int brr[]={1,2,3,4};
		System.out.println(brr.length);
		
		int crr[]={12,3,22,44};
		
		int isum=0;
		for(int i=0;i<brr.length;i++)
		{
			isum=isum+brr[i];
		}
		int isum1=0;
		for(int no:brr)
		{
			isum=isum+no;
		}
		
		for(int i=0;i<crr.length;i++)
		{
			for(int j=0;j<crr[i];j++)
			{
				System.out.println(arr[i][j])
			}
		}
		
	}
}