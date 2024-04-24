import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public  class TestClass {
	

	 
		public static void main(String[] args) {
			
//			 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
//			 
//			 
//			 LocalDateTime now = LocalDateTime.now();  
//			   System.out.println(dtf.format(now));    
			char ch;
			String newString = "";
			
			String orig="Testingthis";
			for (int i=0;i<orig.length();i++)
			{
				ch=orig.charAt(i);
				newString = ch+newString;
				
			}
			
			System.out.println(newString);
			
			
			StringBuilder str= new StringBuilder("Pravat");
			System.out.println(str.reverse());
			   
		
			   
	}
}


