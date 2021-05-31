package qaclickacademy.Mavenjava;

import org.testng.annotations.Test;

public class ManualTest {

	@Test(groups={"smoke"})
	public void functional()
	{
		System.out.println("Functional Test");
		System.out.println("Manual Test is forever, evergreen and everalsting");
		
	}
	@Test
	public void NonFunctiona()
	{
		System.out.println("Non Functional Test");
		System.out.println("Manual Test is forever, evergreen and everalsting");
	}
}
