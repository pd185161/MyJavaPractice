package testNGProject;

import java.util.HashSet;

import org.testng.annotations.Test;

public class Demo2 {
	
	@Test(priority=0)
	public void firstDuplicateinArray()
	
	{
		int arr[] = {10, 5, 3, 5, 3, 9, 6};
		
		// Initialize index of first repeating element
        int min = -1;
 
        // Creates an empty hashset
        HashSet<Integer> set = new HashSet<>();
 
        // Traverse the input array from right to left
        for (int i=0;i<arr.length; i++)
        {
            // If element is already in hash set, update min
            if (set.contains(arr[i]))
                min = i;
 
            else   // Else add element to hash set
                set.add(arr[i]);
        }
 
        // Print the result
        if (min != -1)
          System.out.println("The first repeating element is " + arr[min]);
        else
          System.out.println("There are no repeating elements");
    
		
	}
}
