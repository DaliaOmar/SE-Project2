package software;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logOutSteps {
	boolean isLogin = true;

	@Given("User is Logged In")
	public void user_is_Logged_In() {

		System.out.println("User loged in.");
	}

	@When("user have chosen logs out")
	public void user_have_chosen_logs_out() {
		isLogin = false;

	}

	@Then("Message displayed Logout successfully")
	public void message_displayed_Logout_successfully() {
		
		
		if (isLogin==false)
			System.out.println("Logout successfully");

	}

	@Then("user  returns back to the login page")
	public void user_returns_back_to_the_login_page() {
		System.out.println("you are in login page.");
	}
}
