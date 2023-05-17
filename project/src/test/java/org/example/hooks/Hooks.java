package org.example.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.example.pages.TestBase;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends TestBase{

    @Before
    public void setUp(){
        setUpDriver();
    }

    @After
    public void tearDown(){
        quitDriver();
    }

}

