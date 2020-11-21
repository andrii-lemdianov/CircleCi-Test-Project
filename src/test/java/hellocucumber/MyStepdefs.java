package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    private Calculator calc;
    private int result;
    @Given("I'm in my calc")
    public void iMInMyCalc() {
        calc = new Calculator();
    }

    @When("I do {int} + {int}")
    public void iDo(int arg0, int arg1) {
        result = calc.sum(arg0, arg1);
    }

    @Then("result should be {int}")
    public void resultShouldBe(int arg0) {
        assert result == 2;
    }
}
