package co.com.choucair.certification.automationDemoSite.runners;

import co.com.choucair.certification.automationDemoSite.model.dataDriven.ParameterizedTest;
import org.junit.runner.JUnitCore;

public class RunAllTests {
        public static void main(String[] args) {
            JUnitCore.runClasses(ParameterizedTest.class,RunnerTags.class);
        }
}
