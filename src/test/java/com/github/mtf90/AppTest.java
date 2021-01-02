package com.github.mtf90;

import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void testMain() {
        App.main(new String[0]);
    }

    @Test
    public void testApp() {
        new App();
    }
}
