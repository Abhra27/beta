package mypack;

public class ArrayPal {

	public static void main(String[] args) {
		int arr[]= {121,105,200,505};
		System.out.println("Palindrome numbers are: ");
		for(int i=0;i<arr.length;i++)
		{
			if(isPal(arr[i]))
			{
				System.out.println(arr[i]+" ");
			}
		}

	}
	public static boolean isPal(int n)
	{
		int r=0,n1,n2;
		n2=n;
		while(n2!=0)
		{
			n1=n2%10;
			r=r*10+n1;
			n2=n2/10;
		}
		if(n==r)
			return true;
		else 
			return false;
	}

}
