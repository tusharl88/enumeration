package enumeration;

	public enum brother {
		tushar ("nice", "22"),
		kelsey("intelligent","15"),
		julia ("fine","16");
		
		private final String character;
		private final String age;
		
		brother(String description, String birthday)
		{
			character = description;
			age= birthday;
			
		}
		public String getCharacter()
		{
			return character;
		}
		public String getage()
		{
			return age;
		}
		}



