import java.util.Scanner;

public class CreateGroups
	{
		public static void createGroups()
		{
			
		}
		
		public static void askHowManyGroups()
		{
			System.out.println("How many groups would you like to create?");
			Scanner userInput = new Scanner(System.in);
			int input = userInput.nextInt();
			splitUpGroups(input);
		}
		
		public static void splitUpGroups(int numberOfGroups)
		{
			
		}
	}
