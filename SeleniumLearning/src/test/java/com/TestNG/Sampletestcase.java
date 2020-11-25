package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Sampletestcase {
  @Test
  public void testcase1() {
	  System.out.println("Test case1");
	  
  }
  @Test
  public void testcase2() {
	  System.out.println("Test case2");
	  
  }
  @Test
  public void testcase3() {
	  System.out.println("Test case3");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method:Login");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method:close App");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class:Prepare Test data");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class:clear Test data");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test:Open db connection");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test:close db connection");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite:smoke testing");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite:Generating Report");
  }

}
