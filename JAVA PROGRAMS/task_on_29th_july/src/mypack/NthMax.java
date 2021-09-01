package mypack;

public class NthMax {

	public static void main(String[] args) {
		int arr[]= {5,69,40,9,50,69};
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);

	}

}
