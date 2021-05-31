package qaclickacademy.Mavenjava;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITest{
@Parameters({"systemPropertyVariables"})	
@Test
public void SoapUI(String propertyName)
{
	System.out.println("Enter the soapUI code");
	System.out.println("Entered and verified  the soapUI code");
	System.out.println(propertyName);
}
@Parameters({"systemPropertyVariables"})
@Test
public void RestApi(String propertyName)
{
	System.out.println("Enter the Rest Api Code");
	System.out.println("Entered and verified  the Rest Api Code");
	System.out.println(propertyName);
}
}
