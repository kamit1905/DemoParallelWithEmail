package com.app.sunbeam.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 extends BaseTest {
	
	@Test(enabled = true )
	public void getup() {
		Assert.assertEquals("Pune", "Pune");
	}
	
	@Test(enabled = true)
	public void getup1Test() {
		Assert.assertEquals("Mumbai", "Mumbai");
		Assert.assertFalse(false);
	}

}
