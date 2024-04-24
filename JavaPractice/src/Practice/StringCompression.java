package Practice;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
Compression techniuq hacker rank
Input = aabbbcd
Output =a2b3cd
		 */
		
		Scanner in = new Scanner(System.in);
        String s = in.next();

        int count = 1;
        char prev = s.charAt(0);
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == prev) {
                count++;
            } 
            else 
            {   
            	sb.append(prev);
            	if(count>1)
                sb.append(count);
                count = 1;
                prev = c;
            }
        }
        
        sb.append(prev);
        if(count>1)
        sb.append(count);

        System.out.println(sb.toString());
	}

}
