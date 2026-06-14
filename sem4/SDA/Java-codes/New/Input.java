import java.util.Scanner;
public class Input {

	public static void main(String[] args) {
		
		int a, b, sum;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		a= input.nextInt();
		
		System.out.println("Enter Second Number");
		b= input.nextInt();
		
		sum=a+b;
		System.out.println("Sum of two Number:" + sum);

	}

}
