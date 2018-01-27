package pack1;



import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Class2 {

	
	@Given("^program for add$")
	public void program_for_add() throws Throwable {
	    int a=10;
	    int b=20;
	    int c=a+b;
	    System.out.println(c);
	}



	@When("^program fo mul$")
	public void program_fo_mul() throws Throwable {
		  int a=10;
		    int b=20;
		    int c=a*b;
		    System.out.println(c);
	}

	@When("^program for div$")
	public void program_for_div() throws Throwable {
		  int a=10;
		    int b=2;
		    int c=a/b;
		    System.out.println(c);
	}

}
