package hello;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3 {
  @Test(groups= {"login"})
  public void weblogincarloan() {
	  System.out.println("Belong to web login");
  }
  @Test(enabled=false)
  public void mobilelogincarloan() {
	  System.out.println("Belong to mobile login");
}
  @BeforeSuite
  public void mobilelogin() {
	  System.out.println(" mobile login before suite");
}
  @AfterSuite
  public void mobilelogout() {
	  System.out.println(" mobile logout after suite");
}
  @Test(timeOut=4000)
  public void apilogincarloan() {
	  System.out.println("Belong to api login");
}
  
  @Test(dataProvider="getdata")
  public void login(String uname ,String pass)
  {
	  System.out.println(uname+pass);
	  
  }
  @DataProvider()
  public Object[][] getdata()
  
  {
	  Object[][] data=new Object[3][2];
	  data[0][0]="first user";
	  data[0][1]="first password";
	  data[1][0]="second user";
	  data[1][1]="second password";
	  data[2][0]="third user";
	  data[2][1]="third password";
  return data;

}
}

// Test suite 
