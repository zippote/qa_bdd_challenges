package stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class vowelsTest {
    WebDriver driver;

    @Given("a valid list of strings")
    public void a_valid_list_of_strings() {
        System.out.println("PRINT SOMETHING IN GIVEN METHOD");
    }
    @When("user enters a valid string")
    public void user_enters_a_valid_string() {
        System.out.println("PRINT SOMETHING IN WHEN METHOD");
    }
    @Then("the program will display the total number of vowels in the string")
    public void the_program_will_display_the_total_number_of_vowels_in_the_string() {
        System.out.println("PRINT SOMETHING IN THEN METHOD");
    }

}