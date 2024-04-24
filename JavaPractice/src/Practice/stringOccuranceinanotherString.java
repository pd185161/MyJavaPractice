package Practice;

public class stringOccuranceinanotherString {
	
	// find the number of times a string occurs as a subsequence in a given String
	
	public static long CountSubsequenceString(String s1, String s2)
	{
		int m = s1.length();
		int n = s2.length();
		
		long[] count = new long[n];
		
		for(int i=0; i<m; i++)
		{
			for(int j = n-1; j>=0; j--)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					count[j] += (j==0 ? 1 : count[j-1]);
				}
			}
		}
		return count[n-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hrw", s2= "hrwher";
		System.out.println(CountSubsequenceString(s1,s2));
		
	}

}
