package my_practice;

import java.util.Arrays;

public class ArrayRotation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rotate=2;
		int[] arr={1,2,3,4,5,6};
		int temp=0;
		for(int i=0;i<rotate;i++)//Number of Rotations
		{	temp=arr[arr.length-1];
			for(int j=arr.length-1;j>0;j--){
			
				arr[j]=arr[j-1];
				
			}
		arr[0]=temp;//store last position
		}
	System.out.print(Arrays.toString(arr));
	}

}
