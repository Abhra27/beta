package eg;

public class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {15,16,23,22,44,57};
		try {
			System.out.println(arr[15]);
		}
		catch(Exception e)
		{
			System.out.println("Array out of bound exception");
		}
		finally {
			System.out.println("Exception handled");
		}

	}

}
