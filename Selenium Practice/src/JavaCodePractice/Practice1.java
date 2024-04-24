package JavaCodePractice;

import java.util.*;

public class Practice1 {

	public static void main(String[] args) {
		//find the longest substring from a given string that doesn’t contain any duplicate characters
		String s = "testing";
		Practice1 ob = new Practice1();
		System.out.println(ob.lengthOfLongestSubstring(s));

	}

	public static int lengthOfLongestSubstring(String str) {
		int n = str.length();
		int res = 0;

		for (int i = 0; i < n; i++) {

			boolean[] visited = new boolean[256];

			for (int j = i; j < n; j++) {
				if (visited[str.charAt(j)] == true)
					break;

				else {
					res = Math.max(res, j - i + 1);
					visited[str.charAt(j)] = true;
				}
			}
			visited[str.charAt(i)] = false;
		}
		return res;
	}

}
