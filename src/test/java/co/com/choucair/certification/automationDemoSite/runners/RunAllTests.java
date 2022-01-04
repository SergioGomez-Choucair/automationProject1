package co.com.choucair.certification.automationDemoSite.runners;

import co.com.choucair.certification.automationDemoSite.model.dataDriven.ParameterizedPatientTest;
import org.junit.runner.JUnitCore;

public class RunAllTests {
        public static void main(String[] args) {
            JUnitCore.runClasses(ParameterizedPatientTest.class,RunnerTags.class);
        }
}
