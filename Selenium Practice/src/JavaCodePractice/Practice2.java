package JavaCodePractice;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.Keys;

public class Practice2 {

	public static void main(String[] args) {
		
		int[] arr= {1, 5, 7, -1};
		int k = 6;
		
		int count = 0;
		
		for(int i = 0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==k)
				{
					System.out.println("number sets are "+ arr[i]+" " + arr[j]);
					count=count+1;
				}
			}
		}
	
		
		System.out.println(count);
		
		String a = "test";
		a.replace('t', 'k');
		
	}
}