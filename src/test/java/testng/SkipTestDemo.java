package testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestDemo {
	
	Boolean datasetup =true;
	
	@Test(enabled=false)
	public void skipTest1()
	{
		System.out.println("Skipping this test as it is not complete");;
	}
	@Test
	public void skipTest2()
	{
		System.out.println("Skipping this test as it is not complete");
	    throw new SkipException("Skipping this test");
	}
	@Test
	public void skipTest3()
	{
		System.out.println("Skipping this test as it is not complete");;
	}



}
