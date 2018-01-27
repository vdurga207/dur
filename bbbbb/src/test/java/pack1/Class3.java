package pack1;



import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Class3 {

	
	@Given("^program for addition$")
	public void program_for_add() throws Throwable {
	    int a=10;
	    int b=20;
	    int c=a+b;
	    System.out.println(c);
	}

	@Given("^program for substraction$")
	public void program_for_sub() throws Throwable {
		  int a=10;
		    int b=20;
		    int c=a-b;
		    System.out.println(c);
	}
	
	@Given("^program for sub$")
	public void program_for_subb() throws Throwable {
		  int a=10;
		    int b=20;
		    int c=a-b;
		    System.out.println(c+"Antony");
	}

	@When("^program fo multiplication$")
	public void program_fo_mul() throws Throwable {
		  int a=10;
		    int b=20;
		    int c=a*b;
		    System.out.println(c);
	}

	@When("^program for division$")
	public void program_for_div() throws Throwable {
		  int a=10;
		    int b=2;
		    int c=a/b;
		    System.out.println(c);
	}
	
	@Given("^haha haha$")
	public void haha_haha() throws Throwable {
	    System.out.println("Haha haha this is ha ha haha");
	}

}
