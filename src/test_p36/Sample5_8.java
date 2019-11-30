package test_p36;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Sample5_8
{

	public static void main(String[] args)
	{
		try
		{
			//這裡要列出檔案的"絕對路徑"
			FileReader fr = new FileReader("D:\\eclipse-workspace\\homework5\\text1.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String str1 = br.readLine();
			String str2 = br.readLine();
			
			System.out.println("寫入到檔案中的兩個字串是");
			System.out.println(str1);
			System.out.println(str2);
			
			br.close();
		}
		catch(IOException e)
		{
			System.out.println("輸出入錯誤");
		}

	}

}
