package nk;
import java.util.*;
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int i,j,row,col,sum=0,sum2=0;
			System.out.print("Enter row size: ");
			row=s.nextInt();
			System.out.print("Enter column size: ");
			col=s.nextInt();
			int a[][]=new int [row][col];
			for(i=0;i<row;i++)
			{
				for(j=0;j<col;j++)
				{
				System.out.print("Enter array values: ");
				a[i][j]=s.nextInt();
				}
			}
			for(i=0;i<row;i++)
			{
				for(j=0;j<col;j++)
				{
				System.out.print(" "+a[i][j]);
				sum=sum+a[i][j];
				}
			
			
			System.out.print(" ="+sum);
			sum2=0;
			sum=0;	
			System.out.println();
			}
			for(i=0;i<row;i++)
			{	
				for(j=0;j<col;j++)
				{
					sum2=sum2+a[j][i];
				}
			System.out.print(sum2+" ");
			sum2=0;
			}
			
			
		}
		
	}


