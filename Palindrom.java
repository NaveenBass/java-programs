package my_practice;

public class Palindrom {

	public static void main(String args[]){
	int original=234;
	int remainder;
	int reverse=0;
	int i=0;
	while(i<original){
		remainder=original%10;
		reverse=reverse*10+remainder;
		original=original/10;
	}
	
	System.out.println(reverse);

	if(reverse==original){
		System.out.println(original+" is a palindronme number");
	}
	else{
		System.out.println(original+" is not a palindrome number");
	}
	
	}

}