import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		int num1, num2, res, i;
		char op;

		for(i = 0; i <= 15; i++)
		{
			System.out.print("Enter first number: ");
			Scanner scan = new Scanner(System.in);
			num1 = scan.nextInt();

			System.out.print("Enter second number: ");
			Scanner sc = new Scanner(System.in);
			num2 = sc.nextInt();

			System.out.print("Enter the operation: ");
			Scanner in = new Scanner(System.in);
			op = in.next().charAt(0);

			switch(op)
			{
				case '+':
				res = num1 + num2;
				System.out.println(res);
				break;

				case '-':
				res = num1 - num2;
				System.out.println(res);
				break;

				case '*':
				res = num1 * num2;
				System.out.println(res);
				break;

				case '/':
				res = num1 / num2;
				System.out.println(res);
				break;
			}
		}
	}
}
