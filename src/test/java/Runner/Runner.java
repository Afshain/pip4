package Runner;
//import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import io.cucumber.testng.CucumberOptions;
//import org.junit.jupiter.api.Test;


    @CucumberOptions(
            features = {"src/test/resources/Feature/Login.feature"},
            monochrome = true,
            glue = {"org.example.StepDefs"},
            plugin = {"json:target/cucumber.json", "pretty"})

public class Runner extends AbstractTestNGCucumberTests {

}
