//READ ONLY
import java.io.File;
import java.io.FileInputStream;
class FileConcept1
{
	public static void main(String args[])
	{
	File f1=new File("D:/soft/programming softs/Oops1.txt");
		if(f1.exists())
		{
		if(f1.isFile())
		{
			System.out.println(f1.getName()+" File available");
			System.out.println(f1.isHidden());
			System.out.println(f1.canRead());
			f1.setReadOnly();
			System.out.println(f1.canWrite());
			f1.setWritable(true);
			System.out.println(f1.canWrite());
			System.out.println(f1.getPath());
			System.out.println("Total Characters in this file: "+f1.length());
		try
		{
		FileInputStream ob=new FileInputStream(f1);
			for(int i=0;i<f1.length();i++)
			{
			System.out.print((char)ob.read());
			}
		}
		catch(Exception e)
		{
		System.out.println("File read error "+e.toString());
		}					



		}
		if(f1.isDirectory())
		{
			System.out.println(f1.getPath()+" Folder available");
		}
		}
		else
		{
			System.out.println(f1.getName()+" Searching file is not exists");
		
		}
	}
			
}