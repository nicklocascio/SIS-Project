
public class Student
	{
		private String firstName;
		private String lastName;
		private String period1Class;
		private String period1Grade;
		private String period2Class;
		private String period2Grade;
		private String period3Class;	
		private String period3Grade;
		
		public Student (String fn, String ln, String p1, String p2, String p3, String p1g, String p2g, String p3g)
		{
			firstName = fn;
			lastName = ln;
			period1Class = p1;
			period1Grade = p1g;
			period2Class = p2;
			period2Grade = p2g;
			period3Class = p3;
			period3Grade = p3g;
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

		public String getPeriod1Class()
			{
				return period1Class;
			}

		public void setPeriod1Class(String period1Class)
			{
				this.period1Class = period1Class;
			}

		public String getPeriod1Grade()
			{
				return period1Grade;
			}

		public void setPeriod1Grade(String period1Grade)
			{
				this.period1Grade = period1Grade;
			}

		public String getPeriod2Class()
			{
				return period2Class;
			}

		public void setPeriod2Class(String period2Class)
			{
				this.period2Class = period2Class;
			}

		public String getPeriod2Grade()
			{
				return period2Grade;
			}

		public void setPeriod2Grade(String period2Grade)
			{
				this.period2Grade = period2Grade;
			}

		public String getPeriod3Class()
			{
				return period3Class;
			}

		public void setPeriod3Class(String period3Class)
			{
				this.period3Class = period3Class;
			}

		public String getPeriod3Grade()
			{
				return period3Grade;
			}

		public void setPeriod3Grade(String period3Grade)
			{
				this.period3Grade = period3Grade;
			}
		
	}
