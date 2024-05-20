package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = "C:\\Users\\joshi\\OneDrive\\Desktop\\selinium\\Cucumber\\src\\test\\resources\\EbayFeatures\\search.feature",
		glue="Steps"
		)

public class SearchRunner {
	
	

}
