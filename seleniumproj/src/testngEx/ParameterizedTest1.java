package testngEx;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest1 {
@Test
@Parameters("strun")
public void ParameterTest(String strun)
{
	System.out.println("parameterized value is:jgjgikkkhkh"+strun);
}
}
