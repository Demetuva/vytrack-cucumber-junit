package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
                "json:target/json-reports/cucumber.json",
                "rerun:target/rerun.txt" ,
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features",
        glue="com/vytrack/step_definitions",
        dryRun = false,
        tags = "@all or @wip"
)
public class CukesRunner {

}
