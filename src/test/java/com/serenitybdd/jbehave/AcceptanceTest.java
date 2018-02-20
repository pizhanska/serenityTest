package com.serenitybdd.jbehave;

import net.serenitybdd.jbehave.SerenityStories;

public class AcceptanceTest extends SerenityStories {
    public void JBehaveTestCase() {
        runSerenity().inASingleSession();
    }
}
