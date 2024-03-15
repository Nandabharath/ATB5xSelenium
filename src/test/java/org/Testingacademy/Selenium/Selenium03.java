package org.Testingacademy.Selenium;

import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium03 {
    @Test
    public void Testmethod(){
//Extension to the Edge Browser
        // YouTube video -. Ad blocker Extension
        // Selenium ?
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--headless");
        edgeOptions.addExtensions(new File(""));

    }
}
