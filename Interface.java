package naveen;
interface Star1{
	int a=10,b=20,c=a+b;
	void company1();
}
interface Star2{
	int x=100,y=1000,z=x-y;
	void company2();
	
}
class Son implements Star1,Star2{
	public void company1(){
		System.out.println("interface Star1:"+c);
		System.out.println("interface Star2: "+z);
		
	}
	public void company2() {
		System.out.println("::::Welcome to interface::::");
		System.out.println("interface Star1: "+(a*b));
		System.out.println("interface Star2: "+(x+y));
		
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son ob=new Son();
		ob.company2();
		ob.company1();
	}

}
