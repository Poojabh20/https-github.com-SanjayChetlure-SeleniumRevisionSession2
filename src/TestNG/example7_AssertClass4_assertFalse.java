package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example7_AssertClass4_assertFalse
{
	@Test
	public void TC1() 
	{
		boolean actResult=true;
		Assert.assertFalse(actResult,"fAILED- act result is true:    ");
	}
	
}
