package eg;

import java.util.Scanner;

public class CalArea extends Area
{
	public int rectangle(int h,int w)
	{
		return h*w;
	}
	public int square(int s)
	{
		return s*s;
	}
	public int trapezium(int b1,int b2,int h)
	{
		return ((b1*b2)/2)*h;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		int s=sc.nextInt();
		int b1=sc.nextInt();
		int b2=sc.nextInt();
		CalArea c=new CalArea();
		c.Area(h,w,s,b1,b2);
		int s1=sc.nextInt();
		if(s1==1)
		{
			int j=c.rectangle(h, w);
			c.display(j);
		}
		if(s1==2)
		{
			c.display(c.square(s));
		}
		if(s1==3)
		{
			c.display(c.trapezium(b1, b2, h));
		}
	}

}
