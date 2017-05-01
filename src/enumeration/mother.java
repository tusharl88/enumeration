package enumeration;

public class mother {
	public static void main(String [] args)
	{
		for( brother person:brother.values())
		{
			System.out.printf("%s\t%s\t%s\n",person, person.getCharacter(), person.getage());
		}
	}

}
