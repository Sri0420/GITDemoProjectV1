package testng;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount =6, threadPoolSize=6)
	public void Test01() {
		System.out.println("I am in Test01");
	}

}
