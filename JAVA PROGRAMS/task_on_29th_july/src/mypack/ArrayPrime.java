package mypack;

public class ArrayPrime {

	public static void main(String[] args) {
		int arr[]= {2,5,8,7,15,13};
		for(int i=0;i<arr.length;i++)
		{
			if(isPrime(arr[i]))
			{
				System.out.println(arr[i]+" ");
			}
		}

	}
	public static boolean isPrime(int n)
	{
		boolean b=true;
		if(n==1||n==0)
			b=false;
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					b=false;
					break;
				}
			}
		}
		return b;
	}

}
