package Practice;

public class ReverseWordsinString {

	public static void main(String[] args) {
		/* Given a string, the task is to reverse the order of the words in the given string.
		Input: s = “geeks quiz practice code” 
		Output: s = “code practice quiz geeks”
		 */
		
		String input = "geeks quiz practice code";
		String[] temp = input.split("\\s");
		String output = "";
		
		for(int i = temp.length-1; i>=0 ;i--)
		{
			
			output=output+" "+temp[i];
		}
		System.out.println(output.trim());
	}

}
