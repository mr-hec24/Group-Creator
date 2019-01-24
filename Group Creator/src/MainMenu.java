import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu
	{
		static ArrayList<Student> studentRoster= new ArrayList<Student>();
		public static void main(String[] args) throws IOException
			{
				greeting();
				optionsMenu();
			}
		
		public static void greeting()
		{
			String[] title = {"G","R","O","U","P"," ","C","R","E","A","T","O","R"};
			
			for (String letter: title)
				{
					try
						{
							System.out.print(letter + " ");
							Thread.sleep(150);
						} 
					catch (InterruptedException e)
						{
							e.printStackTrace();
						}
				}
			System.out.println(" ");
		}
		
		public static ArrayList<Student> fillArrayList() throws IOException
		{
			Scanner nameRoster = new Scanner(new File("NameRoster.txt"));
			
			int i = 0;
			while (nameRoster.hasNextLine())
				{
					String line = nameRoster.nextLine();
					String[] names = line.split(" ");
					studentRoster.add(new Student(names[0], names[1]));
					i++;
				}
			
			return studentRoster;
		}
		
		public static void optionsMenu() throws IOException
		{
			boolean choosing = true;
			while (choosing)
				{
					String[] options = {"[1] Generate New Groups","[2] Input Previous Group(s)","[3] Leave"};
					for (String o: options)
						{
							try
								{
									Thread.sleep(300);
									System.out.println(o);
								} 
							catch (InterruptedException e)
								{
									e.printStackTrace();
								}
						}
					Scanner userInput = new Scanner(System.in);
					int userChoice = userInput.nextInt();
					
					switch (userChoice)
					{
						case 1:
								{
									CreateGroups.createGroups();
									break;
								}
						case 2:
								{
									
									break;
								}
						case 3:
								{
									System.out.println("Alright then. Good-Bye");
									choosing = false;
									break;
								}
						default:
								{
									String[] error = {"T","R","Y"," ","A","G","A","I","N","!"};
									for (String letter: error)
										{
											try
												{
													System.err.print(letter + " ");
													Thread.sleep(150);
												} 
											catch (InterruptedException e)
												{
													e.printStackTrace();
												}
										}
									System.out.println(" ");
									break;
								}
					}
					
				}
			
		}
	}
