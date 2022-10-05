import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WebformTestV1 {
@Test
    void shouldMakeConfirm(){
    Selenide.open("http://localhost:9999");
    $ ("[data-test-id = 'name']").setValue("Иван Иванов");
    $ ("[data-test-id = 'phone']").setValue("+79003170909");
    $ ("[data-test-id = 'agreement']").click();
    $$("button").find(Condition.exactText("Продолжить")).click();

}

}
