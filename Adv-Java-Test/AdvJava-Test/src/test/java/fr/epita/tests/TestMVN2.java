package fr.epita.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

public class TestMVN2 {

    private static final Logger LOGGER = LogManager.getLogger(TestMVN2.class);


    @Test
    public void firstOuptut(){
        LOGGER.trace("trace message");
        LOGGER.debug("debug message");
        LOGGER.info("info message");
        LOGGER.warn("warn message");
        LOGGER.error("error message");
    }





}
