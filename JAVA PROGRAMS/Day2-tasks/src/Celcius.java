import java.util.Scanner;

public class Celcius {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in fahrenheit:");
		float f = sc.nextFloat();
		float c;
		
		c=((f-32)*(5))/9;
		System.out.println("The temperature in celcius is "+c);
	}


}
