package nk;

public class Constructor {

	int a,b,c;
	public Constructor()
	{
		a=12;
		b=24;
		c=a+b;
	}
 
	void dis()
	{
		System.out.println("a = "+a+"\nb= "+b+"\nc= "+c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Constructor obj=new Constructor();
	obj.dis();//should not call constructor because its default 
	
			
		}
	}


