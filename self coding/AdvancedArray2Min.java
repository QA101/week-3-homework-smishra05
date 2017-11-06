import java.util.Scanner;

public class AdvancedArray2Min {

	public static void main(String[] args) {
		/*
		 2)Write a program which takes as input 1D- array and finds minimum number, it’s
index value.
		 */
		
		int arr_size = 0;
		int min=0;
		int minindex=0;
		Scanner in = new Scanner(System.in);
	    arr_size=in.nextInt();
	    int arr[] = new int[arr_size];
	    for (int i=0;i<arr_size;i++)
	    {
	    	arr[i]=in.nextInt();
	    	
	    }
	    min=arr[0];
	    for (int i=0;i<(arr_size);i++)
	    {
	    	if(min>arr[i])
	    	{
	    		min=arr[i];
	    		minindex=i;
	    	}
	    }
	    System.out.println(min);
	    System.out.println(minindex);
	    in.close();

	}

}
