package com.evalartapp.tasks;

import com.evalartapp.questions.GetTextField;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.evalartapp.userInterfaces.charsTest.*;


public class FillCharField implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
            String txtDescriptionWrite;
            String countLetter = "";

            txtDescriptionWrite = actor.asksFor(GetTextField.from(TXT_WRITE));
            String[] numberOfLetters = txtDescriptionWrite.split(" ");
            String findChar = txtDescriptionWrite.substring(txtDescriptionWrite.length() - 2, txtDescriptionWrite.length() - 1);
            for (int j = 0; j < Integer.parseInt(numberOfLetters[1]); j++) {
                countLetter += findChar;
            }

            actor.attemptsTo(Enter.theValue(countLetter).into(TEXT_FIELD));
    }

    public static FillCharField chars() {
        return Tasks.instrumented(FillCharField.class);
    }
}