package _sandbox;

import java.io.IOException;
import org.testng.annotations.DataProvider;

public class BaseTest_Draft {
	@DataProvider(name="zTest_main")
	  public Object[][] dataProviderMethod(Class<?> c) throws IOException {
		  System.out.println(c.getName());  // print test method name
		  return new Object[][] { new Object[] { "Cedric" }};
	  }
}
