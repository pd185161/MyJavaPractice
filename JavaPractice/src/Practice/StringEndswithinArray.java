package Practice;

public class StringEndswithinArray {

	public static void main(String[] args) {
		// Find strings from a string array which ends with t
		
		String[] str = {"prabat", "pat", "khushi", "barat", "prashi" };
		
		for(int i =0; i < str.length; i++)
		{
			if(str[i].endsWith("t"))
			{
				System.out.println(str[i] + " ");
			}
		}
		
	}

}
