package com.boot;

import com.boot.controller.HomeController;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest  {

    @Test
    public void testApp() {
        HomeController hc = new HomeController();
        String result = hc.home();
        assertEquals(result, "Das Boot, reposrting for duty");
    }
}
