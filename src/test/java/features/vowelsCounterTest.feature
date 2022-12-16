Feature: Count and display the number of vowels and consonants in a list of words
  As a user
  I want the feature to be able to count and display the number of vowels and consonants for each word in a list of strings

  Scenario Outline: Count and display vowels and consonants in a list of words
    Given a list of <words>
    When I count and display the number of vowels and consonants in each word
    Then the result should display <this_output>

    Examples:
   | words |this_output|
   | "apple" |"apple" has 2 vowels and 3 consonants|
   | "banana" |"banana" has 3 vowels and 3 consonants|
   | "bwm" |"bwm" has 0 vowels and 3 consonants|
   | "ui" |"ui" has 2 vowels and 0 consonants|
   | "" |"" has 0 vowels and 0 consonants|


  Scenario Outline: Count and display vowels and consonants in a list of words with upper and lower case characters
    Given a list of <words>
    When I count and display the number of vowels and consonants in each word
    Then the result should display <this_output>

    Examples:
      | words |this_output|
      | "ApPlE" |"apple" has 2 vowels and 3 consonants|
      | "BaNaNa" |"banana" has 3 vowels and 3 consonants|
      | "BMW" |"bwm" has 0 vowels and 3 consonants|
      | "UI" |"ui" has 2 vowels and 0 consonants|
      | "Dublin" |"Dublin" has 2 vowels and 4 consonants|
      | "Alvaro" |"Alvaro" has 3 vowels and 3 consonants|

  Scenario Outline: Count and display vowels and consonants in a list with an empty string
    Given a list of <words>
    When I count and display the number of vowels and consonants in each word
    Then the result should display <this_output>

    Examples:
      | words |this_output|
      | "" |"" has 0 vowels and 0 consonants|

  Scenario Outline: Count and display the number of vowels and consonants in a list of words with special characters
    Given a list of <words>
    When I count and display the number of vowels and consonants in each word
    Then the result should display <this_output>

    Examples:
      | words |this_output|
      | "a@pp!le" |"a@pp!le" has 2 vowels and 3 consonants|

  Scenario Outline: Count and display the number of vowels and consonants in a list of words with hyphenated words
    Given a list of <words>
    When I count and display the number of vowels and consonants in each word
    Then the result should display <this_output>

    Examples:
      | words |this_output|
      | "a-pple" |"a-pple" has 2 vowels and 3 consonants|

  Scenario Outline: Count and display the number of vowels and consonants in a list of strings with spaces
    Given a list of <words>
    When I count and display the number of vowels and consonants in each word
    Then the result should display <this_output>

    Examples:
      | words |this_output|
      | "a pple" |"a pple" has 2 vowels and 3 consonants|

  Scenario Outline: Count and display the number of vowels and consonants in a list of strings containing numbers
    Given a list of <words>
    When I count and display the number of vowels and consonants in each word
    Then the result should display <this_output>

    Examples:
      | words |this_output|
      | "a8ple" |"a8ple" has 2 vowels and 2 consonants|

