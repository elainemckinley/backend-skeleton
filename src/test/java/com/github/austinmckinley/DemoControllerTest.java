package com.github.austinmckinley;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class DemoControllerTest {
    DemoController controller;

    @Before
    public void setup() {
        controller = new DemoController();
    }

    @Test
    public void testGetDemo() {
        assertThat(controller.getDemo(), equalTo("Demo! :)"));
    }
}