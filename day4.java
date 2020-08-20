package hello;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day4 {
 
  @AfterMethod
  public void webloginhomeloan() {
	  System.out.println("Belong to web login after method");
  }
  @Test(groups= {"socialsite"})
  public void mobileloginhomeloan() {
	  System.out.println("Belong to mobile login");
}
  @BeforeMethod
  public void apiloginhomeloan() {
	  System.out.println("Belong to api login before method");
}}

// What is the meaning of listner  ITestListner