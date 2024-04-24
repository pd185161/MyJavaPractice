package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class SearchSuggestionSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] products = {"mobile","mouse","moneypot","monitor","mousepad"};
		String searchWord  = "mouse";
		
		System.out.println(suggestedProducts(products,searchWord));
	}
	
	public static List<List<String>> suggestedProducts(String[] products, String searchWord)
	{
		List<List<String>> res = new ArrayList<>();
		TreeMap<String, Integer> map = new TreeMap<>();
		
		Arrays.sort(products);
		
		List<String> list = Arrays.asList(products);
		
		for(int i = 0; i<products.length; i++)
		{
			map.put(products[i], i);
			
		}
		
		String key = "";
		for(char c: searchWord.toCharArray())
		{
			key = key + c;
			String from = map.ceilingKey(key);
			String to = map.floorKey(key + "~");
			
			if(from == null || to== null)
			{break;}
			
			res.add(list.subList(map.get(from), Math.min(map.get(from)+3 , map.get(to)+1)));
			
		}
		while(res.size()<searchWord.length())
		{
			res.add(new ArrayList<>());
		}
		
		return res;
		
	}

}
