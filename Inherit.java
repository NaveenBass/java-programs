package naveen;
import java.util.*;
class Start{
	int a,b,c;
	void mirror1(int c,int b) {
		a=c+b;
		System.out.println("class Start Answer a: "+a);
		
	}
}
class Mid extends Start{
	void mirror2(int a,int b) {
		c=a+b;
		System.out.println("class Mid Answer c: "+c);
		mirror1(c,b);
	}
}
class Finish extends Start{
	void mirror3(int a,int b) {
		
		c=a-b;
		System.out.println("class Finish Answer c:"+c);
		mirror1(c,b);
		mirror1(c,b);
		mirror1(c,b);
		mirror1(c,b);
	}
	void mirror4(int c,int a) {
		b=c+a;
		System.out.println("class Finish Answer b:"+b);
		mirror1(c,b);
		mirror1(c,b);
	}
}
public class Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a & b");
		int a=scan.nextInt();
		int b=scan.nextInt();
		Finish $=new Finish();
		Mid $_=new Mid();
		$.mirror4(a,b);
		$.mirror3(a, b);
		$_.mirror2(a, b);
	}

}
