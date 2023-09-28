package com.evalartapp.tasks;

import com.evalartapp.questions.GetTextField;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static com.evalartapp.userInterfaces.imagesTest.*;

public class imagesCount implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        String txtDescriptionImages;
        String txtImages;
        int sum = 0;
        int count = 2;

        txtDescriptionImages = actor.asksFor(GetTextField.from(TXT_DESCRIPTION_IMAGES));
        String[] corte = txtDescriptionImages.split("cuantos ");
        String img = corte[1].substring(0, 2);

        txtImages = actor.asksFor(GetTextField.from(IMAGES));
        for (int j = 0; j < txtImages.length(); j++) {
            if (count <= txtImages.length()) {
                if (txtImages.substring(j, count).contains(img)) {
                    sum++;
                }
                count++;
            }
        }
        actor.attemptsTo(Enter.theValue(String.valueOf(sum)).into(NUMBER_OF_IMAGES));
    }

    public static imagesCount imgs() {
        return Tasks.instrumented(imagesCount.class);
    }
}
