package my_practice;

public class TimeConversion {

	public static void main(String args[]){
		
		int time=5;
		String pm="PM";
		String b=pm;
		String check1=time+b;
		String s=check1;
		
		String am="AM";
		String check2=time+am;
		
		TimeConversion ch=new TimeConversion();
		
	//	ch.check(pm, time);
		ch.check(am, time);
		
	}

	public void check(String x,int y){
		
		int ch_time=y;
		
		if(x.equals("PM") && y==ch_time){
			System.out.println(y+12+":"+x);
			System.out.println("is pm");
			
		}
		else{
			System.out.println(12-y+":"+x);
			System.out.println("is am");
		}
	}

}
