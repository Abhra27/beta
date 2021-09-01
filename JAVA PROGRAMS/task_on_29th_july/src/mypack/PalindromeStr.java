package mypack;

import java.util.Scanner;

public class PalindromeStr {
    public static void main() {
    	Scanner sc=new Scanner(System.in);
    	String A=sc.nextLine();
    	StringBuilder B=new StringBuilder(A);
    	if(!isPal(B))
    	{
    		System.out.println(B.reverse().toString());
    	}
    	else
    	{
    		
    	}
		
	}
}
