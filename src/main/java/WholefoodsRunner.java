import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by jahangir shaheen on 9/29/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        tags = {"@debug"},
        features = {"src/test/Resources/Features"},
        glue = {""}
)
public class WholefoodsRunner {
}
