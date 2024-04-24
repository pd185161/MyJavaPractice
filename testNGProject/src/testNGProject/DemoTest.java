package testNGProject;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DemoTest {
	
	
	@Test(priority=0)
	public void PrintName()
	{
	 int[] arr1 = {1,2,5,2};
	 int[] arr2 = {9,3,4,2};
	 
	
	
	 for (int i=0;i<arr1.length;i++)
	 {
		 for(int j = i+1; j<arr1.length;j++)
		 {
			 int temp=0;
			 
			 if(arr1[i]> arr1[j])
			 {
				temp= arr1[i];
				arr1[i]=arr1[j];
				arr1[j]=temp;
			 }
			 
		 }
		 
	 }
	 for (int i = 0; i < arr1.length; i++) 
     {     
        System.out.println(arr1[i]);  
     }
	
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("This is AfterTest");
	}
	
	@BeforeTest
	public void Pretest()
	{
		System.out.println("This is beforeTest");
	}
	
}