import com.codeborne.selenide.Configuration;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class CheckingthesampleCodeDi {

@BeforeAll
    static  void beforeAll() {
    Configuration.browserSize = "1920x1080";
    Configuration.holdBrowserOpen = true;}
    @Test
    void Checkingthesamplecode(){
//- Откройте страницу Selenide в Github
// - Перейдите в раздел Wiki проек
// - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
// - Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
//
    open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".Box-row.wiki-more-pages-link").$("button").click();
        $(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));
}
}




