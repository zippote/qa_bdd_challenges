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
   | "Dublin" |"Dublin" has 2 vowels and 4 consonants|
   | "Alvaro" |"Alvaro" has 3 vowels and 3 consonants|

