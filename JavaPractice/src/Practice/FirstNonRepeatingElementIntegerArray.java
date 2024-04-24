package Practice;

import java.util.Map;
import java.util.TreeMap;

public class FirstNonRepeatingElementIntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,2,5,6,10,1,2,5};
        TreeMap<Integer , Integer> tr = new TreeMap<Integer, Integer>();

       for(int i = 0 ; i < arr.length; i++)
           {
               if(tr.containsKey(arr[i]))
               {
                   tr.put(arr[i], tr.get(arr[i])+1);
               }
               else
               {
                   tr.put(arr[i], 1);
               }
           }
       System.out.println(tr);

       for (Map.Entry<Integer,Integer> entry: tr.entrySet())
           {
               if(entry.getValue()==1)
               {
                   System.out.println("First non repeating number is "+ entry.getKey());
                   break;
               }
           }
	}

}
