import java.util.ArrayList;

public class Student
	{
		private String firstName;
		private String lastName;
		private Student[] previousPartners;
		private boolean alreadyInGroup = false;
		
		public Student(String f, String l, Student[] p)
		{
			firstName = f;
			lastName = l;
			previousPartners = p;
		}
		
		public Student(String f, String l)
		{
			firstName = f;
			lastName = l;
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

		public Student[] getPreviousPartners()
			{
				return previousPartners;
			}

		public void setPreviousPartners(Student[] previousPartners)
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
