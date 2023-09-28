package com.evalartapp.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.evalartapp.userInterfaces.login.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class fillForm implements Task {

    private final String user;
    private final String pass;

    public fillForm(String user, String pass){
        this.user = user;
        this.pass = pass;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(USER_FIELD, isPresent()).forNoMoreThan(10).seconds(),
                Enter.theValue(user).into(USER_FIELD),
                Enter.theValue(pass).into(PASSWORD_FIELD),
                Click.on(BTN_SEND)
        );
    }

    public static fillForm succesfuly(String user, String password){
        return Tasks.instrumented(fillForm.class, user, password);
    }
}
