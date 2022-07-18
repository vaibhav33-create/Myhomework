package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\Java program\\MyDemoBdd\\features\\login.feature"
					,glue= {"stepDefination"})


public class TestRunner {

}