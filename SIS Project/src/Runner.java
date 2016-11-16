import java.util.Scanner;
public class Runner
	{
	public static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args)
		{
		int input = userInput.nextInt();
		System.out.println("What would you like to do?"
				+"(1) Add or delete a student."
				+ "(2) Change students grades/ schedule."
				+ "(3) Sort students.");
			
			if(input == 1)
			{
				System.out.println("(1) Add a student."
						+ "(2) Delete a student.");
			}
		}
	}
