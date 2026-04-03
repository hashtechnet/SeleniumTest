package retryFailedTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryFailedTest  {
	
	@Test(retryAnalyzer=retryFailedTestCase.RetryAnalyzer.class)
	public void test()
	{
		int count=0;
		System.out.println(count);
		Assert.assertTrue(false);
	}

}
