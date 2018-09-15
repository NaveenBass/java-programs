//WRITE ONLY

import java.util.*;
import java.io.FileOutputStream; //for write(FileInputStream = for read)
import java.io.File;

class FileConcept2
{
	public static void main(String args[])throws Exception
	{
	Scanner scan=new Scanner(System.in);
	File f2=new File("d:/news.txt");
	FileOutputStream fos=new FileOutputStream(f2);
	System.out.println("Enter Text");
	String text1=scan.nextLine(); // here type our letter through scanner
	int size=text1.length();   //here find scan text length 
	byte bv[]=new byte[size]; //should convert text into byte for storage and space
	bv=text1.getBytes();  //convert text into byte for store
	fos.write(bv);	//here write the letter after convert the byte using FileOutputStream(fos is a variable )

	}
}	