package eg;

import java.util.*;

public class Name {

    public static String lovePalindromes(String str) {

        //this is default OUTPUT. You can change it.

        String result;

        int n=str.length();

        StringBuffer s=new StringBuffer(str);

        char c=str.charAt(n-1);

        s.reverse();

        String s1=s.toString();

        boolean b=str.equals(s1);

        if(b!=true)

        {

            result=Character.toString(c);

        }

        else

        {

            result="Z";

        }

        

        return result;

        

    }

    public static void main(String args[])

    {

        Scanner sc=new Scanner(System.in);

        //INPUT [uncomment & modify if required]   

        String str = sc.next();

        

        //OUTPUT [uncomment & modify if required]

        System.out.println(lovePalindromes(str));
        

    }

}
