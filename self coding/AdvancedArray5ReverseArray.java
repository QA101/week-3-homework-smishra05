import java.util.Scanner;

public class AdvancedArray5ReverseArray {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		 Write a program which takes as input 1D- array and reverse an array.*/
		
		int arr_size = 0;
		Scanner in = new Scanner(System.in);
	    arr_size=in.nextInt();
	    int arr[] = new int[arr_size];
	    for (int i=0;i<arr_size;i++)
	    {
	    	arr[i]=in.nextInt();
	    }
		for (int i=(arr_size-1);i>=0;i--)
	    {
	    	System.out.println("a"+"["+i+"]"+"="+arr[i]);
	    }
		in.close();
		
			}


	}

