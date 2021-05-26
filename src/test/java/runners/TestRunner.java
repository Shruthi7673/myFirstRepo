package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  //wats this
@CucumberOptions(
        monochrome=true,
        features={"src/test/resources/features/assignmentFile.feature"},
        glue={"steps"} ,//location of step definitions grouped in a package
        plugin= {"pretty","html:target/report.html"},
       // tags="@placeorder"
        tags ="@addtocart or @placeorder or @review or @reviewError or @compareList or @clearCompareList or @emailFriendErrorMessage or @emailFriend or @addToWishList"// single tag


)
public class TestRunner
{

}
