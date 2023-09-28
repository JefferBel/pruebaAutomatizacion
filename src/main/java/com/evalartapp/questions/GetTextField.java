package com.evalartapp.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;


public class GetTextField implements Question<String> {
    private Target elemento;

    public GetTextField(Target elemento) {
        this.elemento = elemento;
    }

    @Override
    public String answeredBy(Actor actor){
        actor.attemptsTo(WaitUntil.the(elemento, isVisible()).forNoMoreThan(10).seconds());
        return the(elemento).answeredBy(actor).getText();
    }

    public static GetTextField from(Target elemento){
        return new GetTextField(elemento);
    }
}
