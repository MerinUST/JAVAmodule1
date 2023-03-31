package com.ust.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FirstTest {
  @Test(priority=1,description="this is executed first")
  public void f() {
	  System.out.println("from method f");
  }
  @Test(priority=2,description="tests description")
  public void a() {
	  System.out.println("from method a");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("from before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("from after test");
  }

}
