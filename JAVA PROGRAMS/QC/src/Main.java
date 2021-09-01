

	import java.util.*; 
	import java.lang.*;
	import java.io.*;
	import java.lang.Math;

	public class Main {
	    public static void cipher(String S) {
	        //this is default OUTPUT. You can change it
	        StringBuilder sb=new StringBuilder(S);
	        String str[]=S.subString(1);
	        int i;
	        for(i=0;str.length;i++)
	        {
	            if(str[i]=="A")
	            {
	                System.out.print("01");
	            }
	            else if(str[i]=="B")
	            {
	                System.out.print("02");
	            }else if(str[i]=="C")
	            {
	                System.out.print("03");
	            }else if(str[i]=="D")
	            {
	                System.out.print("04");
	            }else if(str[i]=="E")
	            {
	                System.out.print("05");
	            }else if(str[i]=="F")
	            {
	                System.out.print("06");
	            }else if(str[i]=="G")
	            {
	                System.out.print("06");
	            }else if(str[i]=="H")
	            {
	                System.out.print("07");
	            }else if(str[i]=="H")
	            {
	                System.out.print("08");
	            }else if(str[i]=="I")
	            {
	                System.out.print("09");
	            }else if(str[i]=="J")
	            {
	                System.out.print("10");
	            }else if(str[i]=="K")
	            {
	                System.out.print("11");
	            }else if(str[i]=="L")
	            {
	                System.out.print("12");
	            }else if(str[i]=="M")
	            {
	                System.out.print("13");
	            }else if(str[i]=="N")
	            {
	                System.out.print("14");
	            }else if(str[i]=="O")
	            {
	                System.out.print("15");
	            }else if(str[i]=="P")
	            {
	                System.out.print("16");
	            }else if(str[i]=="Q")
	            {
	                System.out.print("17");
	            }else if(str[i]=="R")
	            {
	                System.out.print("18");
	            }else if(str[i]=="S")
	            {
	                System.out.print("19");
	            }else if(str[i]=="T")
	            {
	                System.out.print("20");
	            }else if(str[i]=="U")
	            {
	                System.out.print("21");
	            }else if(str[i]=="V")
	            {
	                System.out.print("22");
	            }else if(str[i]=="W")
	            {
	                System.out.print("23");
	            }else if(str[i]=="X")
	            {
	                System.out.print("24");
	            }else if(str[i]=="Y")
	            {
	                System.out.print("25");
	            }else
	            {
	                System.out.print("26");
	            }
	        }
	        //WRITE YOUR LOGIC HERE:
	               
	                
	        //For optimizing code, You are free to make changes to "return type", "variables" and "Libraries".        
	        
	    }
	    public static void main(String[] args) {
	        // INPUT [uncomment & modify if required]
	        Scanner sc = new Scanner(System.in);
	        String S = sc.next();
	       
	        // OUTPUT [uncomment & modify if required]
	        cipher(S);
	        sc.close();
	    }
	}


