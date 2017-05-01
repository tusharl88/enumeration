package enumeration;
import java.util.EnumSet;
public class mother1 {
	public static void main(String [] args)
	{
		for( brother1 person:brother1.values())
		{
			System.out.printf("%s\t%s\t%s\n",person, person.getCharacter(), person.getage());
		}
		System.out.println("and now for range of constants\n");
		
		for( brother1 person:EnumSet.range(brother1.kelsey,brother1.candy)) //here we have given range.
				{
			System.out.printf("%s\t%s\t%s\n",person, person.getCharacter(), person.getage());
				}
	}
}
