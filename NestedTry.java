package nk;
import java.util.*;
public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		int age=s.nextInt();
		if(age<17)
		throw new Exception(age+" :Your not eligible");
		else 
			System.out.println(age+" :Your Age Accepted");
		
		try {
		
			System.out.println("Enter Array Size: ");
			int size=s.nextInt();
			int a[]=new int[size];
			System.out.println("Enter postion to store your age in array");
			int pos=s.nextInt();
			a[pos]=age;
			System.out.println("Your age sucessfully stored");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(" Range of array position Exceed");
			
		}
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println(" Donot give Negative values");
			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
		
	}
}	
	


