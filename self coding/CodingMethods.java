import java.util.Scanner;

/*
 *
Programming exercises for Methods:

1. Write a method which takes as input as a one number and returns first five even
numbers.
2. Write a method which takes as input as a one number and returns first ten odd
numbers.
3. Write a method which takes as input as a one number and returns first seven
square numbers.
4. Write a method which takes as input as a one number and returns the sum of a
number.
5. Write a method which takes as input as a one number and returns the product of
a number.
6. Write a method which takes as input as a one number and returns the reverse of
a number.
7. Write a method which takes as input as a two number and returns swape of
numbers.
8. Write a method which takes as input as a two number and returns the maximum
of the two.
9. Write a method which takes as input as a two number and returns the minimum
of the two.
10. Write a method which takes as input as a one number and returns the factorial of
a number.
11. Write a method which takes as input as a three number and returns the
maximum of the three.
12. Write a method which takes as input as a three number and returns the minimum
of the three.

Note: output is a set of string so define your output type as “String”

public class Method1 {
	public static void main(String[] args) {
		System.out.println(PrintNumber(5));
	}
	
	public static String PrintNumber(int n){
		String Final = “ “;
		for(int i=1;i&lt;=n;i++){
			Final = Final + “ “ + i;
		}

	return Final;
	}
}
 */
public class CodingMethods {

	
	public static void main(String[] args) {
		int even = 0;
		Scanner in = new Scanner(System.in);
		//Print first 5 even numbers from the input number-
		
		System.out.println("Enter a number to print even numbers");
		even = in.nextInt();
		System.out.println(Even(even));
		
		//Print first ten odd numbers from the input number
		int odd = 0;
		System.out.println("*********************");
		System.out.println("Enter a number to print odd numbers");
		odd = in.nextInt();
		System.out.println(Odd(odd));
		
		//Print first seven square numbers from the input number.
		int sq=0;
		System.out.println("*********************");
		System.out.println("Enter a number to print square numbers");
		sq = in.nextInt();
		System.out.println(Square(sq));
		
		//Print sum of the digits of the number.
		System.out.println("*********************");
		int n=0;
		System.out.println("Enter a number to print sum of the digits");
		n = in.nextInt();
		System.out.println(Sum(n));
		
		//Print product of the digits of the number.
		System.out.println("*********************");
		int num=0;
		System.out.println("Enter a number to print product of the digits");
		num = in.nextInt();
		System.out.println(Product(num));
		
		//Print reverse of the digits of the number.
		System.out.println("*********************");
		int num1=0;
		System.out.println("Enter a number to print reverse of the digits");
		num1 = in.nextInt();
		System.out.println(Reverse(num1));
		
		//Takes as input as a two number and returns the maximum of the two
		System.out.println("*************Max of 2********");
		int one =0;
		int two=0;
		System.out.println("enter first number");
		one = in.nextInt();
		System.out.println("enter second number");
		two = in.nextInt();
		System.out.println(Max(one,two));	
		

		//Takes as input as a two number and returns the minimum of the two
		System.out.println("**********Min of 2***********");
		int first=0;
		int second = 0;
		System.out.println("enter first number");
		first = in.nextInt();
		System.out.println("enter second number");
		second = in.nextInt();
		System.out.println(Min(first,second));	
		
		//takes as input as a three number and returns the maximum of the three.
		System.out.println("**********Max of 3***********");
		int i=0;
		int j=0;
		int k=0;
		System.out.println("enter first number ");
		i = in.nextInt();
		System.out.println("enter second number ");
		j = in.nextInt();
		System.out.println("enter third number");
		k = in.nextInt();
		System.out.println(Max3(i,j,k));	
		
	
			
		//takes as input as a three number and returns the minimum of the three.
		System.out.println("**********Min of 3***********");
		int a=0;
		int b=0;
		int c=0;
		System.out.println("enter first number");
		a = in.nextInt();
		System.out.println("enter second number");
		b = in.nextInt();
		System.out.println("enter third number");
		c = in.nextInt();
		System.out.println(Min3(a,b,c));
		
		//takes as input as a two number and returns swap of numbers.
		System.out.println("**********Swap of numbers***********");
		int p=0;
		int q=0;
		System.out.println("enter first number");
		p = in.nextInt();
		System.out.println("enter second number");
		q = in.nextInt();
		System.out.println(Swap(p,q));	
		
		
		//Write a method which takes as input as a one number and returns the factorial of a number.
		System.out.println("**********Factorial***********");
		int num8=0;
		System.out.println("Enter a number for which you want a factorial of");
		num8 = in.nextInt();
		System.out.println(Factorial(num8));	
		
		in.close();
		
	}

	
	




	private static String Even(int num) 
	{
	String EvenNumbers = "";	
	for(int i=0;i<10;i++)
	{
		if(num%2==0)
		{
			EvenNumbers = EvenNumbers+" "+num;
		}
		num++;
		
	}
		return EvenNumbers;
		
	}
	
	private static String Odd(int num) {
		String OddNumbers = "";	
		for(int i=0;i<20;i++)
		{
			if(num%2!=0)
			{
				OddNumbers = OddNumbers+" "+num;
			}
			num++;
			
		}
			return OddNumbers;
		
	}
	
	private static String Square(int sq) {
		String sqNumbers = "";	
		for(int i=0;i<7;i++)
		{
				sqNumbers = sqNumbers+" "+sq*sq;
				sq++;
			
		}
			return sqNumbers;
		
	}
	
	private static String Sum(int n) 
	{ 
		int sum = 0;
		while(n>0)
		{
			sum=sum+n%10;
			n=n/10;
		}
		return ("Sum is "+sum);
		
	}
	private static String Product(int num) {
		int product = 1;
		while(num>0)
		{
			product=product*(num%10);
			num=num/10;
		}
		return ("Product is "+product);
	}
	
	private static String Reverse(int num1) {
		String rev = "";
		while(num1>0)
		{
			rev=rev+""+num1%10;
			num1=num1/10;
		}
		return ("Reverse is "+rev);
	}
	


	private static String Swap(int p,int q) {
		
		int temp=0;
		temp=p;
		p=q;
		q=temp;
		return("Swap is "+p+q);
		
	}
	
	private static String Max (int first,int second) 
	{ 
		if (first>second)
			return ("Max is "+first);
			else 
				return("Max is "+second);
		
	}
	



	private static String Min(int first, int second) {
		// TODO Auto-generated method stub
		if (first<second)
		return ("Min is "+first);
		else 
			return("Min is "+second);
		
	}



	private static String Max3(int first,int second, int third) {
		int max = 0;
		if(first>second && first>third)
		{
			max=first;
		}else if(second>first && second>third)
		{
			max=second;
		}else if(third>first && third>second)
		{
			max=third;
		}
		return ("Max is "+max);
	}
	
	private static String Min3(int first,int second,int third) {
		int min = 0;
		if(first<second && first<third)
		{
			min=first;
		}else if(second<first && second<third)
		{
			min=second;
		}else if(third<first && third<second)
		{
			min=third;
		}
		return ("Min is "+min);
	}




	private static String Factorial(int num8) {
		// TODO Auto-generated method stub
		int fac=1;
		while (num8>0)
		{
			fac=fac*num8;
			num8--;
		}
		return ("Factorial is "+fac);
	}










}
