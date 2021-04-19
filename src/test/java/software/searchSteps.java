package software;
import static org.junit.Assert.assertEquals;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchSteps {
	int r = 0;
	boolean b = false ;
	boolean login=false;
	String rA;
	
	String [] title = { "Life After Death: A Novel", "A Desolation Called Peace", "A Deeper Love Inside", "Leonardo da Vinci Paperback" };
	String [] author = { "Sister Souljah", "Arkady Martine", "Sister Souljah", "Walter Isaacson" };
	String [] ISBN = { "1982139137", "1250186463", "1439165327", "1501139169" };
	String [] signature = { "souljah2021", "martine2021", "souljah2014", "walter2018" };
	String t , a , i , user , pass , book ;
	boolean not = false ;
	boolean b1 = false ;
	boolean b2 = false ;
	boolean b3 = false ;
	String authorMore;
	

	@When("user open store book and searches for a book with title {string}")
	public void user_open_store_book_and_searches_for_a_book_with_title(String string){
		String searchedTitle=string;
		for (int i = 0; i < title.length; i++) {
			if (findd(title,searchedTitle, i)) {
				r = i;
				b = true;
				rA=title[i];
			}
		}
	}
@Then("A list of books that match the title  spscification should be returned and printed on screen")
		public void aListOfBooksThatMatchTheTitleSpscificationShouldBeReturnedAndPrintedOnScreen() {
	String raa;
	if (b) {
		raa=title[r];
		assertEquals(rA,raa);
		System.out.println("Title: " + title [r] + "\t" + "Author: " + author [r] + "\t" + "ISBN: " + ISBN [r] + "\t" + "Signature: "
				+ signature [r]);
	}
	else {
		System.out.println("Book is not exist");	
		assertEquals(false,b);
		}
	}


	@When("user open store book and searches for book with auther {string}")
	public void user_open_store_book_and_searches_for_book_with_auther(String string) {
		String searchedAuthor =string;
		for (int i = 0; i < title.length; i++) {
			if (findd(author,searchedAuthor, i)) {
				r = i;
				b = true;
				rA=author[i];
			}
		}
	}


	@Then("A list of books that match the auther spscification should be returned and printed on screen")
	public void a_list_of_books_that_match_the_auther_spscification_should_be_returned_and_printed_on_screen() {
		String aa;
		if (b) {
			aa=author[r];
			assertEquals(rA,aa);
			System.out.println("Title: " + title [r] + "\t" + "Author: " + author [r] + "\t" + "ISBN: " + ISBN [r] + "\t" + "Signature: "
					+ signature [r]);
		}
		else {
			System.out.println("Book is not exist");	
			assertEquals(false,b);
			}
	}

	@When("user open store book part and searches for book with ISBN {string}")
	public void user_open_store_book_part_and_searches_for_book_with_ISBN(String string) {
	String searchedIsbn =string;
	for (int j = 0; j < title.length; j++) {
		if (findd(ISBN,searchedIsbn, j)) {
			r = j;
			b = true;
			rA=ISBN[j];
		}
	}
	}
	
	@Then("A list of books that match the ISBN spscification should be returned and printed on screen")
		public void aListOfBooksThatMatchTheISBNSpscificationShouldBeReturnedAndPrintedOnScreen() {
		String ii;
		if (b) {
			ii= ISBN [r];
			assertEquals(rA,ii);
			System.out.println("Title: " + title [r] + "\t" + "Author: " + author [r] + "\t" + "ISBN: " + ISBN [r] + "\t" + "Signature: "
					+ signature [r]);
		}
		else {
			System.out.println("Book is not exist");	
			assertEquals(false,b);
			}
	}
	
	
	@When("user logedin and open store book part and searches any thing {string}")
		public void userLogedinAndOpenStoreBookPartAndSearchesAnyThing(String string) {
		
		login=true;
        String book=string;
		for (int i = 0; i < title.length; i++) {
			if (findd(title,book, i)) {
				r = i ;
				b = true;
				rA=title[i];
			}
		}
		
		for (int i = 0; i < title.length; i++) {
			if (findd(author,book, i)) {
				r = i ;
				b1 = true;
				rA=author[i];
			}
		}
		 b2 = false ;
		for (int j = 0; j < title.length; j++) {
			if (findd(ISBN,book, j)) {
				r = j ;
				b2 = true;
				rA=ISBN[j];
			}
		}
		 b3 = false ;
		for (int i = 0; i < title.length; i++) {
			if (findd(signature,book, i)) {
				r = i ;
				b3 = true;
				rA=signature[i];
			}
		}
		if (b || b1 || b2 || b3) not = true;
		}


		@Then("A list of books that match spscification should be returned and printed on screen3")
		public void aListOfBooksThatMatchSpscificationShouldBeReturnedAndPrintedOnScreen3() {
			String s = "";
			if (b1 ) s= author [r];
			else if (b) s=title [r];
			else if (b2) s= ISBN [r];
			else if (b3) s=signature[r];
			
			if (!not) {
				System.out.println("Book is not exist");	
				assertEquals(false,b);
			}
			else {
			assertEquals(rA,s);
			System.out.println("Title: " + title [r] + "\t" + "Author: " + author [r] + "\t" + "ISBN: " + ISBN [r] + "\t" + "Signature: "
						+ signature [r]);
			
			}
		}


	
		private boolean findd(String[]a,String notFound,int i) {
			return a[i].contains(notFound);
		}
		
	@When("Admin open book part and add   author on search box {string}")
	public void admin_open_book_part_and_add_author_on_search_box(String string) {
		authorMore=string;
	}
	@Then("A list of books that match  spscification should be returned and printed on screen1")
		public void a_List_Of_Books_That_Match_Spscification_Should_Be_Returned_And_Printed_On_Screen1() {
		int r = 0;
		String authorMm="";
		boolean  flag=false;
		for (int i = 0; i < title.length; i++) {
			if (author[i].contains(authorMore)) {
				r = i;
				 authorMm=author[i];
				System.out.println("Title: " + title [r] + "\t" + "Author: " + author [r] + "\t" + "ISBN: " + ISBN [r] + "\t" + "Signature: "
						+ signature [r]);
			}
		}
		if(authorMm.contains(authorMore)) {
			flag=true;
		}
		assertEquals(true,flag);
	}
}
	


