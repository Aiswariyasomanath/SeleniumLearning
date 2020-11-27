package com.TestNG;

import org.testng.annotations.Test;

public class Dependsongroup {
	 @Test(groups= {"Smoke Testing", "Regression Testing"})
	  public void testcase1() {
		  System.out.println("Test case1");
		  
	  }
	  @Test(groups= {"Smoke Testing", "Sanity Testing"})
	  public void testcase2() {
		  System.out.println("Test case2");
		  
	  }
	  @Test(groups= {"Functional Testing", "Retesting Testing"})
	  public void testcase3() {
		  System.out.println("Test case3");
		  
	  }

}
