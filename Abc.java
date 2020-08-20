package hello;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Abc {
	@BeforeTest
	public void databaseconnection()
	{
		System.out.println(" i am beleongs to  before test ");
	}
	
	@BeforeClass
	public void classmethod()
	{
		System.out.println("before class Abc ");
	}
@Parameters({"URL"})
@Test
	public void demo(String uname)
	{
	System.out.println("hello" + uname);
		
	}
@Test(dependsOnMethods= {"demo"})
public void bye()
{
System.out.println("bye");
	
}
}
