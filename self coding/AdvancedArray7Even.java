import java.util.Scanner;

public class AdvancedArray7Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Write a program which takes as input 1D- array and prints even numbers in the
array.
		*/
		
		int arr_size = 0;
		Scanner in = new Scanner(System.in);
	    arr_size=in.nextInt();
	    int arr[] = new int[arr_size];
	    for (int i=0;i<arr_size;i++)
	    {
	    	arr[i]=in.nextInt();
	    }
		for (int i=0;i<arr_size;i++)
			
	    {
	    	if(arr[i]%2==0)
	    	{
	    		System.out.println("a"+"["+i+"]"+"="+arr[i]);
	    	}
	    }
		in.close();
		
	}

}
