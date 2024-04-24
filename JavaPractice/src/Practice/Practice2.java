package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		
		for(int i =1; i<=q; i++)
		{
		ArrayList<Integer> lines = new ArrayList<>();
		int count = 0;
		while(scan.hasNext())
		{
			count = count +1;
			
			lines.add(scan.nextInt());
			if(count==3)
			{break;}
		
		}
			//System.out.println(lines);
			int a = lines.get(0);
			int b = lines.get(1);
			int n = lines.get(2);
			int sum =0;
			for(int j = 0; j<n; j++)
			{
				//int sum = (int)Math.pow(2, j);
				sum = sum + a +(int)Math.pow(2, j);
			System.out.print(sum);
			System.out.print(" ");
			}
		}
	}
}
