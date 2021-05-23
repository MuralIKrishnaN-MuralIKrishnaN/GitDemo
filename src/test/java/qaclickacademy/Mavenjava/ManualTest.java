package qaclickacademy.Mavenjava;

import org.testng.annotations.Test;

public class ManualTest {

	@Test(groups={"smoke"})
	public void functional()
	{
		System.out.println("Functional Test");
	}
	@Test
	public void NonFunctiona()
	{
		System.out.println("Non Functional Test");
	}
}
