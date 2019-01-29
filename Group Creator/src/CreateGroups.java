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
			GroupCreating.assignGroups(numberOfGroups);
			
//			Student[][] groups = new Student[numberOfGroups][];
//			
//			ArrayList<Student> studentRoster = MainMenu.fillArrayList();
//			int sizeOfGroups = studentRoster.size()/numberOfGroups;
//			int remainingStudents = 0;
//			
//			// This is just calculating the remainder students
//			if (sizeOfGroups * numberOfGroups < studentRoster.size())
//				{
//					remainingStudents = studentRoster.size()%numberOfGroups;
//				}
//			
//			int groupNumber = 1;
//			int numberOfStudentsAlreadyInGroups = 0;
//			
//			// This whole for-each loop is in charge of actually assigning groups
//			for (Student[] group: groups)
//				{
//					System.out.println("Group #" + groupNumber);
//					
//					// This for-each loop makes sure the remaining students are included
//					if (remainingStudents > 0)
//						{
//							int num = 0;
//							group = new Student[sizeOfGroups + 1];
//							remainingStudents--;
//							int temp = numberOfStudentsAlreadyInGroups;
//							
//							for (int i = numberOfStudentsAlreadyInGroups; i < temp + group.length; i++)
//								{
//									group[num] = studentRoster.get(i);
//									System.out.println(i + 1 + ") " + group[num].getFirstName());
//									numberOfStudentsAlreadyInGroups++;
//									num++;
//								}
//						}
//					
//					// This just creates the regular groups
//					else
//						{
//							int num = 0;
//							group = new Student[sizeOfGroups];
//							remainingStudents--;
//							int temp = numberOfStudentsAlreadyInGroups;
//							
//							
//							for (int i = numberOfStudentsAlreadyInGroups; i < temp + group.length; i++)
//								{
//									group[num] = studentRoster.get(i);
//									System.out.println(i + 1 + ") " + group[num].getFirstName());
//									numberOfStudentsAlreadyInGroups++;
//									num++;
//								}
//							
//						}
//					System.out.println("");
//					groupNumber++;
//				}
//			
//			for (Student[] group : groups)
//				{
//					for (Student s: group)
//						{
//							fillInPreviousPartnerArray(group, studentRoster, s);
//						}
//				}
		}

		public static void fillInPreviousPartnerArray(Student[] studentsInGroup, ArrayList<Student> studentRoster, Student target)
		{
			for (Student s: studentsInGroup)
				{
					Student[] studentsNotIncludingHimself = new Student[studentsInGroup.length - 1];
					
					int i = 0;
					for (Student st: studentsInGroup) // SUPPOSED TO ADD ALL STUDENTS BESIDES HIMSELF!
						{
							if (!st.equals(target))
								{
									studentsNotIncludingHimself[i] = st;
								}
							i++;
						}
					
					studentRoster.get(studentRoster.indexOf(s)).setPreviousPartners(studentsNotIncludingHimself);;
				}
		}
		
	}
