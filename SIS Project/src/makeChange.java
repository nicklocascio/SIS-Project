import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class makeChange
	{
	public static void changeGrade() throws IOException
		{
		Scanner file = new Scanner(new File("studentInformation.txt"));	
		String student = file.nextLine();
		System.out.println(student);
		}
	}
