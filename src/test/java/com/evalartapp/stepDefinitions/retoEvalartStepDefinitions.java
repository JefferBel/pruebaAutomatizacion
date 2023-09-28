package com.evalartapp.stepDefinitions;

import com.evalartapp.exceptions.ControlExcepciones;
import com.evalartapp.tasks.FillCharField;
import com.evalartapp.tasks.imagesCount;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import com.evalartapp.tasks.*;
import com.evalartapp.questions.ValidarMensaje;
import org.hamcrest.Matchers;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class retoEvalartStepDefinitions {

    public Actor actor = Actor.named("tester");
    @Before
    public void setup() {
        actor.can(BrowseTheWeb.with(getDriver()));
    }

    @When("Open page evalart")
    public void open_page_evalart() {
        actor.wasAbleTo(Open.url("https://tasks.evalartapp.com/automatization/"));
    }
    @Given("Insert dates of user")
    public void insert_dates_of_user(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        actor.attemptsTo(fillForm.succesfuly(data.get(0).get(0),data.get(0).get(1)));
    }

    @When("complete validations")
    public void complete_validations() {
        for (int i=0;i<10;i++){
            actor.attemptsTo(FillCharField.chars());
            actor.attemptsTo(imagesCount.imgs());
            actor.attemptsTo(multiplesOfThree.checkBox());
            actor.attemptsTo(calendarDate.minusDate());
        }
    }

    @Then("Validate message succesful")
    public void validate_message_succesful() {
        actor.should(seeThat(ValidarMensaje.finalizacion(), Matchers.equalToIgnoringCase("<General>c2fe0e21ce445033Mi00LTk5MzAwNw==df63afbf4da3d4b1")).orComplainWith(ControlExcepciones.class, ControlExcepciones.mensajeIncorrecto));
    }
}
