package my_practice;

import java.util.Arrays;

public class ArrayRotation2 {

	public static void main(String args[]){
		
		int rotate=2;
		int[] arr={1,2,3,4,5,6};
		int temp=0;
		int reduce=0;
		int increase=0;
		for(int i=0;i<rotate;i++)
		{	temp=arr[arr.length-1];
			for(int j=arr.length-1;j>reduce;j--){
				
				arr[j]=arr[j-1];
			}
		arr[increase]=temp;
		increase++;
		reduce++;
		}
		
	System.out.print(Arrays.toString(arr));
	}
}
