package software;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber/wikipedia.html"},
        monochrome = true,
        snippets= CucumberOptions.SnippetType.CAMELCASE,
       // features = "C:\\Users\\DELL\\eclipse-workspace\\SE-Project\\use_cases\\logOut.feature",
         features = "use_cases",
        glue = "software"
)
public class acceptanceTest {

}


