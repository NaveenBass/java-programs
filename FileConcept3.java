//READ AND WRITE
import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;

class FileConcept3
{
	public static void main(String args[])throws Exception
	{
	
	File f3=new File("d:/news.txt");
	FileInputStream fis=new FileInputStream(f3);//for reading purpose should be in near for loop
	String s=" ";
	for(int i=0;i<f3.length();i++)
	s=s+((char)fis.read());
	System.out.println("These Texts: "+s);
        System.out.println("Enter Yout Text");
	Scanner scan=new Scanner(System.in);
	String text2=scan.nextLine();
	int size=text2.length();
	text2=s+" "+text2;
	byte bv2[]=new byte[size];
	bv2=text2.getBytes();	
	FileOutputStream fos=new FileOutputStream(f3);//for writing pupose should be in last
	fos.write(bv2);
	}
}