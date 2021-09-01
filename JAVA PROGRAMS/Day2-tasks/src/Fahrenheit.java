import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in celcius:");
		float c = sc.nextFloat();
		float f;
		f = (9/5)*c+32;
		System.out.println("The temperature in Fahrenheit is "+f);
	}

}
