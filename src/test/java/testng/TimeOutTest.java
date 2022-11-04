package testng;

import org.testng.annotations.Test;

public class TimeOutTest {
	
	@Test
	public void FirstTest() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Paused the execution for 2 seconds");
	}
    
	@Test
	public void secondTest() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("Paused the execution for 4 seconds");
	}
}
