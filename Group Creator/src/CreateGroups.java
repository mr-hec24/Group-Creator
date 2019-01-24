import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateGroups
	{
		public static void createGroups() throws IOException
		{
			askHowManyGroups();
		}
		
		public static void askHowManyGroups() throws IOException
		{
			System.out.println("How many groups would you like to create?");
			Scanner userInput = new Scanner(System.in);
			int input = userInput.nextInt();
			splitUpGroups(input);
		}
		
		public static void splitUpGroups(int numberOfGroups) throws IOException
		{
			Student[][] groups = new Student[numberOfGroups][];
			
			ArrayList<Student> studentRoster = MainMenu.fillArrayList();
			int sizeOfGroups = studentRoster.size()/numberOfGroups;
			int remainingStudents = 0;
			
			// This is just calculating the remainder students
			if (sizeOfGroups * numberOfGroups < studentRoster.size())
				{
					remainingStudents = studentRoster.size()%numberOfGroups;
				}
			
			int groupNumber = 1;
			int numberOfStudentsAlreadyInGroups = 0;
			// This whole for-each loop is in charge of actually assigning groups
			for (Student[] group: groups)
				{
					System.out.println("Group #" + groupNumber);
					
					// This for-each loop makes sure the remaining students are included
					if (remainingStudents > 0)
						{
							group = new Student[sizeOfGroups + 1];
							remainingStudents--;
							
							for (int i = numberOfStudentsAlreadyInGroups; i < group.length; i++)
								{
									group[i] = studentRoster.get(i);
									System.out.println(group[i].getFirstName());
									numberOfStudentsAlreadyInGroups++;
								}
						}
					
					// This just creates the regular groups
					else
						{
							group = new Student[sizeOfGroups];
							remainingStudents--;
							
							
							for (int i = numberOfStudentsAlreadyInGroups; i < group.length; i++)
								{
									group[i] = studentRoster.get(i);
									System.out.println(group[i].getFirstName());
									numberOfStudentsAlreadyInGroups++;
								}
							
						}
					System.out.println("");
					groupNumber++;
				}
		}
	}
