import java.util.Scanner;

public class AdvancedArray6SumDiff {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
6) 
6.1 Write a program which takes as input two 1D- array and find the sum of two
array and store results in new array.
Example: input : int [] a ={1,2,3,4};
int[] b = {10,20,30,40};
output : int [] c = {11,22,33,44};


6.2 Write a program which takes as input two 1D- array and find the difference of
two array and store results in new array.
Example: input : int [] a ={1,2,3,4};
int[] b = {10,20,30,40};
output : int [] c = {-9,- 18, -27,- 36};	
*/
		
		int arr_size1 = 0;
		Scanner in = new Scanner(System.in);
	    arr_size1=in.nextInt();
	    int arr1[] = new int[arr_size1];
	    for (int i=0;i<arr_size1;i++)
	    {
	    	arr1[i]=in.nextInt();
	    }
		for (int i=0;i<arr_size1;i++)
	    {
	    	System.out.println("a"+"["+i+"]"+"="+arr1[i]);
	    }
		int arr_size2 = 0;
		Scanner in1 = new Scanner(System.in);
	    arr_size2=in1.nextInt();
	    int arr2[] = new int[arr_size2];
	    for (int i=0;i<arr_size2;i++)
	    {
	    	arr2[i]=in1.nextInt();
	    }
	    int sumarr_size=0;
	    if(arr_size1>arr_size2)
	    {
	    	sumarr_size = arr_size1;
	    }else 
	    {
	    	sumarr_size = arr_size2;
	    }
	    int sum1[] = new int[sumarr_size];
	    
		for (int i=0;i<sumarr_size;i++)
	    {
	       	sum1[i]=arr1[i]+arr2[i];
	    }
		in1.close();
		in.close();
	
		
		
		
			}

}
