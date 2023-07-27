package com.actitime.testscript;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class DisabledCase {
	@Test
	public void greateCustomer()
	{
		Reporter.log("greateCustomer",true);
	}
	@Test(invocationCount = 3)
	public void oeviewCustomer()
	{
		Reporter.log("oeviewCustomer",true);
	}
	@Test
	public void peleteCustomer()
	{
		Reporter.log("peleteCustomer",true);
		
	}//Order of execution will now happen based on priority except CreateCustomer
}
