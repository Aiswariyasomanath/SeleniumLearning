package com.TestNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class DependsOnmethods {
	 @Test
	  public void testcase1() {
		  System.out.println("Test case1");
		  
	  }
	  @Test(dependsOnMethods="testcase1")
	  public void testcase2() {
		  System.out.println("Test case2");
		  Assert.assertEquals("abc", "xyz");
		  
		  
		  
		  
	  }
	  @Test(dependsOnMethods="testcase2",alwaysRun=true)
	  public void testcase3() {
		  System.out.println("Test case3");
		  
	  }

}
