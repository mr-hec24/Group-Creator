import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GroupCreating
	{
		public static void createGroups()
		{
			//This Is The Main Method Of This Class
		}
		
		public static void assignGroups(int numberOfGroups) throws IOException
		{
			Student[][] projectNumber1 = new Student[numberOfGroups][];
			
			ArrayList<Student> studentRoster = MainMenu.fillArrayList();
			int sizeOfGroups = studentRoster.size()/numberOfGroups;
			int remainingStudents = 0;
			
			// This is just calculating the remainder students
			if (sizeOfGroups * numberOfGroups < studentRoster.size())
					remainingStudents = studentRoster.size()%numberOfGroups;
			
			String[] project1 = {"P","R","O","J","E","C","T","","#","1"};
			MainMenu.dramaticPrintOut(150, project1);
			int numberOfGroupsAlreadyCreated = 0;
			
			for (Student[] group: projectNumber1) //Filling in the groups for project 1
				{
					int sizeOfThisGroup = sizeOfGroups;
					if (remainingStudents != 0)
						{
							sizeOfThisGroup++;
							remainingStudents--;
						}
						
					
					group = new Student[sizeOfThisGroup];
					
					Integer groupNumber = numberOfGroupsAlreadyCreated + 1;
					String[] groupTitle = {"G","r","o","u","p"," ","#", groupNumber.toString()};
					MainMenu.dramaticPrintOut(100, groupTitle);
					
					int placeInGroup = 0;
					for (int i = sizeOfThisGroup * numberOfGroupsAlreadyCreated; i < sizeOfThisGroup * groupNumber; i++)
						{
							group[placeInGroup] = studentRoster.get(i);
							System.out.println("[" + ( i + 1 ) + "] " + group[placeInGroup].getFirstName() + " " + group[placeInGroup].getLastName());
							placeInGroup++;
						}
					
					groupNumber++;
					numberOfGroupsAlreadyCreated++;
					System.out.println(" ");
				}
		}
	}
