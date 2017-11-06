import java.util.Scanner;

public class AdvancedArray1Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 1)Write a program which takes as input 1D- array and finds maximum number , it’s
index value.

		 */
		
		int arr_size = 0;
		int max=0;
		int maxindex=0;
		Scanner in = new Scanner(System.in);
	    arr_size=in.nextInt();
	    int arr[] = new int[arr_size];
	    for (int i=0;i<arr_size;i++)
	    {
	    	arr[i]=in.nextInt();
	    	
	    }
	    max=arr[0];
	    for (int i=0;i<(arr_size);i++)
	    {
	    	if(max<arr[i])
	    	{
	    		max=arr[i];
	    		maxindex=i;
	    	}
	    }
	    System.out.println(max);
	    System.out.println(maxindex);
	    in.close();

	}

}
