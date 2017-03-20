package com.daphne.cloud.foo.cucumber.stepdefs;

import com.daphne.cloud.foo.FooApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = FooApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
