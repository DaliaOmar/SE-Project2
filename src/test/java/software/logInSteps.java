package software;

import static org.junit.Assert.assertTrue;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logInSteps {
	boolean isLogin = false;
	String[] Username = { "Dalia", "Roaa", "Ahmad", "Haya" };
	String[] Password = { "dr123", "roaa1", "3355", "r243" };
	String[] Passwordwrong = { "dr12", "roaa", "335", "r24" };
	String user_name, passw;
	boolean b = false;
	int r = 0;
	@Given("The user on the login page from the site")
	public void the_user_on_the_login_page_from_the_site() {

	}
@When("user login with data {string} {string}")
		public void userLoginWithData(String string, String string2) {
	 user_name= string;
	 passw=string2;
	
	for (int i = 0; i < Username.length; i++) {
		if (user_name.equalsIgnoreCase(Username[i])) {
			r = i;
			b = true;
		}
	}
	if (!b)
		System.out.println("User is not exist");
	if (b) {
		assertTrue(user_name.equalsIgnoreCase(Username[r]));
		assertTrue(passw.equalsIgnoreCase(Password[r]));
	}

}


	@Then("message displayed  Login Successfully")
	public void message_displayed_Login_Successfully() {
		if (b)
			System.out.println("Your login was successfully " + user_name);
	}

	@Given("The user on the login page")
	public void the_user_on_the_login_page() {

	}
	@When("user  login with informations by using data as {string} {string} and error password")
		public void userLoginWithInformationsByUsingDataAsAndErrorPassword(String string, String string2) {
		user_name = string ;
		passw = string2 ;
		for (int i = 0; i < Username.length; i++) {
			if (user_name.equalsIgnoreCase(Username[i])) {
				r = i;
				b = true;
			}
		}}


	@Then("Error message displayed with wrong password")
	public void error_message_displayed_with_wrong_password() {
		if (!b)
			System.out.println("User is not exist");
		if (b) {
			assertTrue(user_name.equalsIgnoreCase(Username[r]));
			assertTrue(passw.equalsIgnoreCase(Passwordwrong[r]));
		}
		if (b)
			System.out.println("wrong password");
	}

}
