package Practice;

import java.util.HashSet;

public class FirstRepeatingElementIntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,5,6,10,1,2,5};
		//int[] arr= {1,2,5,6,10};
		
		int min = -1;
		HashSet<Integer> hs = new HashSet<>();
		
		boolean flag = false;
		for(int i = arr.length -1; i>=0; i--)
		{
			if(!hs.contains(arr[i]))
			{
				hs.add(arr[i]);
			}
			else 
			{
				min = arr[i];
				flag = true;
			}
				
		}
		if(flag)
		{
		System.out.println("first repeating interger is " + min);
		}
		else 
			System.out.println("no integer is repeating here.");
	}

}
