import java.util.Scanner;

public class MainMenu
	{
		public static void main(String[] args)
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
		
		public static void optionsMenu()
		{
			boolean choosing = true;
			while (choosing)
				{
					System.out.println("[1] Generate New Groups");
					System.out.println("[2] Input Previous Group(s)");
					System.out.println("[3] Change Name Roster");
					System.out.println("[4] Leave");
					Scanner userInput = new Scanner(System.in);
					int userChoice = userInput.nextInt();
					
					switch (userChoice)
					{
						case 1:
								{
									choosing = false;
									break;
								}
						case 2:
								{
									choosing = false;
									break;
								}
						case 3:
								{
									choosing = false;
									break;
								}
						case 4:
								{
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
