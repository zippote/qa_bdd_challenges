package stepsDefinition;

import com.exercise.VowelCounter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class vowelsCounterStepsDefinition {

    VowelCounter counter = new VowelCounter();
    String[] argumentList;

    @Given("a list of {string}")
    public void a_list_of_strings(String string) {
        argumentList = new String[]{string};
    }

    @When("I count and display the number of vowels and consonants in each word")
    public void i_count_and_display_the_number_of_vowels_and_consonants_in_each_word() {
        counter.getVowelListWithCount(argumentList);
    }

    @Then("the result should display {string} has {int} vowels and {int} consonants")
    public void the_result_should_display_has_vowels_and_consonants(String string, Integer int1, Integer int2) {
        String expected = String.format("[CountResult{word='%s', vowelCount=%d, consonantCount=%d}]",
                string, int1, int2);
        Assertions.assertEquals(expected, (counter.getVowelListWithCount(argumentList)).toString());
    }
}
