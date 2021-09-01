package mypack;

import java.util.*;

public class Arrayfirstlastdigit {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=sc.nextInt();
		*/char f,l;
		int i;
		int arr[]=new int[4];
		arr[3]=101;
		arr[2]=22;
		arr[1]=500;
		arr[0]=154;
		
		/*for(i=0;i<n;i++)
		{
		arr[i]=sc.nextLine();
		}*/
		String s[]=new String[arr.length];
		for(i=0;i<arr.length;i++)
		{
			s[i] = String.valueOf(arr[i]);
		}
		StringBuilder sb=new StringBuilder();
		for(i=0;i<arr.length;i++)
		{f=s[i].charAt(0);
		 int c=s[i].length();
		 l=s[i].charAt(c-1);
			if(f!=l)
			{
				sb.append(arr[i]+"\n");
			}
		}
		for(i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(sb[i]);
		}
		
	}
	
}	

