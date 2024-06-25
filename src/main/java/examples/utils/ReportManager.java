package examples.utils;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;

public class ReportManager {

    @Step("Step description for Allure")
    public static void logStep(String message) {
        Allure.step(message);
    }
}

