package enumeration;

public enum brother1 {
	tushar ("nice", "22"),
	kelsey("intelligent","15"),
	julia ("fine","16"),
	nicole("italian","17"),
	candy("i wish","17"),
	erin("different","17");
	
	private final String character;
	private final String age;
	
	brother1(String description, String birthday)
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
