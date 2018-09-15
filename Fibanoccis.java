package nk;
import java.util.*;
public class Fibanoccis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter N value: ");
		int n=scan.nextInt();
		int pre=-1,nex=1,cur=0;
		for(int i=1;i<=n;i++)
		{
			cur=pre+nex;
			System.out.println(" "+cur);
			pre=nex;
			nex=cur;
		}

	}

}
