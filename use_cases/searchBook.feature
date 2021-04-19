Feature: Search book

  Background: User is Logged In
    Given The user on the login page from the site

  @searchTitle
  Scenario Outline: Searching for a substring of the title
    When user open store book and searches for a book with title <title>
    Then A list of books that match the title  spscification should be returned and printed on screen

    Examples: 
      | title   |
      | "Life " |
      | "dalia" |

  @searchAuther
  Scenario Outline: Searching for a substring of the author
    When user open store book and searches for book with auther <auther>
    Then A list of books that match the auther spscification should be returned and printed on screen

    Examples: 
      | auther   |
      | "Sister" |
      | "author" |

  @searchIsbn
  Scenario Outline: Searching for a substring of the ISBN
    When user open store book part and searches for book with ISBN <ISBN>
    Then A list of books that match the ISBN spscification should be returned and printed on screen

    Examples: 
      | ISBN   |
      | "1982" |
      | "123"  |

  @searchWhenLogin
  Scenario Outline: 
    When user logedin and open store book part and searches any thing <book>
    Then A list of books that match spscification should be returned and printed on screen3

    Examples: 
      | book          |
      | "A Deeper"    |
      | "Sister"      |
      | "1982"        |
      | "martine2021" |
      |"anyThing"|

  # @searchNoResult
  #Scenario Outline: No books match the criteria (substring)
  # When user open store book part and add searches for book with thing <input>
  # Then the searches not mentioned in the results and message displayed with not found any thing
  #Examples:
  # | input  |
  #| "Roaa" |
  @searchMore
  Scenario Outline: Find more than one book
    When Admin open book part and add   author on search box <author>
    Then A list of books that match  spscification should be returned and printed on screen1

    Examples: 
      | author   |
      | "Arkady" |
