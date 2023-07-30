package testngattributes;

import org.testng.annotations.Test;

public class t11 {
	
	/*TestNG: TEst next generation
	 * testing framework
	 * inspird from JUNIT
	 * attributes, anotatin,automatic report generation
	 * suite execution
	 * parallel testing 
	 * 
	 * 
	 * test cases
	 *     nonstatic
	 *     @Test
	 *     default order: alphabetical order
	 *     
	 *     priority:  run the test cases in a paritcular order
	 *     description: adding short note on the tst case 
	 *     groups
	 *     invocation count 
	 *     enabled=false ; disable/ignore 
	 *     timeout:  fix time limi tfor test case 
	 *  * 
	 * */
	@Test(priority=0,description="One",groups="U",invocationCount=5,enabled=false )
	public void m1()
	{
		System.out.println("Test case 1");
	}
	
	@Test(priority=1,description="Two",groups="U")
	public void m2()
	{
		System.out.println("Test case 2");
	}
	
	@Test(priority=2,description="Three",groups="Y")
	public void ab()
	{
		System.out.println("Test case 3");
	}

}
