import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

/*
 * Write a program using while Loop.

1) Write a java program to print first 10 numbers.
2) Write a java program to print first 5 Even numbers. EX: 2 4 6 8 10
3) Write a java program to print first 5 odd numbers. EX: 1 3 5 7 9
4) Write a java program to print first 10 square numbers.
5) Write a java program to print first 10 cube numbers.
6) Write a java program to print sum of first 5 numbers.
Example: 1+2+3+4+5 = 15
7) Write a java program to find sum of a number and take input from the user.
8) Write a java program to find product of a number and take input from the user.
9) Write a java program to find reverse a number and take input from the user.
10) Write a java program to find sum of first 5 even numbers. Ex: 2+4+6+8+10 = 30
 */

		//print first 10 numbers
		int num = 1;
		System.out.print("First 10 numbers: ");
		while (num<=10)
		{
			System.out.print(""+num+"");
			num++;
		}
		System.out.println("");
		//print first 5 even numbers
		int num1=1;
		System.out.print("First 5 even numbers: ");
		while (num1<=10)
		{
			if(num1%2==0)
			System.out.print(""+num1+"");
			num1++;
		}
		System.out.println("");
		//print first 5 odd numbers
		int num2=1;
		System.out.print("First 5 odd numbers: ");
		while (num2<=10)
		{
			if(num2%2!=0)
			System.out.print(""+num2+"");
			num2++;
		}
		System.out.println("");
		//first 10 square numbers
		int num3=1;
		System.out.print("First 10 square numbers: ");
		while (num3<=10)
		{
			System.out.print(""+num3*num3+"");
			num3++;
		}
		System.out.println("");
		//first 10 cube numbers
		int num4=1;
		System.out.print("First 10 cube numbers: ");
		while (num4<=10)
		{
			System.out.print(""+num4*num4*num4+"");
			num4++;
		}
		System.out.println("");
		//sum of first 5 numbers
		int num5=0;
		System.out.print("Sum of first 5 numbers: ");
		int sum=1;
		while (num5<5)
		{
			sum=sum+num5;
			num5++;
		}
		System.out.print(""+sum+"");
		System.out.println("");
		
		//sum of digits of a number
		int input=0;
		System.out.println("enter input"+"");
		Scanner in = new Scanner(System.in);
		int sum1=0;
		input=in.nextInt();
		while(input>0)
		{
			sum1=sum1+input%10;
			input=input/10;
		}
		System.out.print("Sum of digits of numbers: ");
		System.out.print(""+sum1+"");
		System.out.println("");
		
		//product of digits of a number
		int input1=0;
		System.out.println("enter input"+"");
		int product = 1;
		input1=in.nextInt();
		while(input1>0)
		{
			product=product*(input1%10);
			input1=input1/10;
		}
		System.out.print("Product of digits of numbers: ");
		System.out.print(""+product+"");
		System.out.println("");
		//reverse of a number
		
		int input2=0;
		System.out.println("enter input"+"");
		input2=in.nextInt();
		String rev = "";
		while(input2>0)
		{
			rev=rev+""+input2%10;
			input2=input2/10;
		}
		System.out.print("Reverse of the digits: ");
		System.out.print(""+rev+"");
		System.out.println("");
		
		//print sum of first 5 even numbers
		
		int sumeven=0;
		int number=1;
		while (number<=10)
		{
			if(number%2==0)
			sumeven=sumeven+number;
			number++;
		}
		System.out.print("Sum of first 5 even numbers: ");
		System.out.print(""+sumeven+"");
		in.close();
	}

}
