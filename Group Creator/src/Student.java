import java.util.ArrayList;

public class Student
	{
		private String firstName;
		private String lastName;
		private ArrayList<String> previousPartners;
		private boolean alreadyInGroup = false;
		
		public Student(String f, String l, ArrayList<String> p)
		{
			firstName = f;
			lastName = l;
			previousPartners = p;
		}
		
		public Student(String f, String l)
		{
			firstName = f;
			lastName = l;
			previousPartners = new ArrayList<>();
		}

		public String getFirstName()
			{
				return firstName;
			}

		public void setFirstName(String firstName)
			{
				this.firstName = firstName;
			}

		public String getLastName()
			{
				return lastName;
			}

		public void setLastName(String lastName)
			{
				this.lastName = lastName;
			}

		public ArrayList<String> getPreviousPartners()
			{
				return previousPartners;
			}

		public void setPreviousPartners(ArrayList<String> previousPartners)
			{
				this.previousPartners = previousPartners;
			}

		public boolean isAlreadyInGroup()
			{
				return alreadyInGroup;
			}

		public void setAlreadyInGroup(boolean alreadyInGroup)
			{
				this.alreadyInGroup = alreadyInGroup;
			}
		
		
	}
