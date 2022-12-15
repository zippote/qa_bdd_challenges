Feature: A user should be able to add up to 4 strings at once
  Scenario: a user inputs 4 strings
    When user enters a list of words
    Then display the total number of vowels and consonants for each string in order