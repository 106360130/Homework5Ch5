package test_p35;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Sample5_7
{

	public static void main(String[] args)
	{
		try
		{
			FileWriter fw = new FileWriter("text1.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			
			pw.println("Hello!");
			pw.println("GoodBye!");
			
			pw.close();
			
			System.out.println("��Ƥw�g�g�J�ɮפF");
			
	        File f = new File("text1.txt");

	        System.out.println("������| : " + f.getAbsolutePath());
		}
		catch(IOException e)
		{
			System.out.println("��X�J���~");
			
		}

	}

}
