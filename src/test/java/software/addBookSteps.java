package software;


import java.util.ArrayList;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addBookSteps {
	boolean login=false;
	Book books = new Book(null, null, null, null);
	ArrayList<Book> list = new ArrayList<Book>();

	@Given("Admin is logged in and want to add book")
	public void admin_is_logged_in_and_want_to_add_book() {
		System.out.println("You are logged in");
	}
	@When("Admin fill the data  for the book {string},{string},{string},{string} and added them")
		public void adminFillTheDataForTheBookAndAddedThem(String string, String string2, String string3, String string4) {
		boolean login=true ;
		String title=string;
		String author=string2;
		String signature=string3;
		String ISBN=string4; 
		list.add(books);	}


	@Then("admin should see the book added in book part")
	public void admin_should_see_the_book_added_in_book_part() {

		for (Book admin_should_see_the_book_added_in_book_part : list) {
			System.out.println(books.toString());
		}

	}

	@When("Admin open The book part")
	public void admin_open_The_book_part() {
		 login=false;
		System.out.println("\nYou are not logged in");
	

	}

	@Then("Error message displayed with you should log in as admin to the site")
	public void error_message_displayed_with_you_should_log_in_as_admin_to_the_site() {

		System.out.println("you should log in as admin to the site");

	}

	@Then("admin  returns back to the login page")
	public void admin_returns_back_to_the_login_page() {

		System.out.println("you are in login page");

	}

}