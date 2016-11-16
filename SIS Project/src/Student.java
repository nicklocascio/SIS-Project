
public class Student
	{
		private String firstName;
		private String lastName;
		private int GPA;
		private String period1Class;
		private String period2Class;
		private String period3Class;
		
		public Student (String fn, String ln, int gpa, String p1, String p2, String p3)
		{
			firstName = fn;
			lastName = ln;
			GPA = gpa;
			period1Class = p1;
			period2Class = p2;
			period3Class = p3;
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

		public int getGPA()
			{
				return GPA;
			}

		public void setGPA(int gPA)
			{
				GPA = gPA;
			}

		public String getPeriod1Class()
			{
				return period1Class;
			}

		public void setPeriod1Class(String period1Class)
			{
				this.period1Class = period1Class;
			}

		public String getPeriod2Class()
			{
				return period2Class;
			}

		public void setPeriod2Class(String period2Class)
			{
				this.period2Class = period2Class;
			}

		public String getPeriod3Class()
			{
				return period3Class;
			}

		public void setPeriod3Class(String period3Class)
			{
				this.period3Class = period3Class;
			}

	}
