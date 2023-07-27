package com.actitime.testscript;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class isabledTestCase {
	@Test
	public void CreateCustomer()
	{
		Reporter.log("CreateCustomer",true);
	}
	@Test(invocationCount = 3)
	public void ReviewCustomer()
	{
		Reporter.log("ReviewCustomer",true);
	}
	@Test
	public void DeleteCustomer()
	{
		Reporter.log("DeleteCustomer",true);
		
	}//Order of execution will now happen based on priority except CreateCustomer
}

