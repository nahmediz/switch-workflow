package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        LOGGER.info("Feature 1 is arriving");
        LOGGER.info("Feature 1 is getting finished!");
        LOGGER.info("Enabler 1 is arriving!");
        LOGGER.info("Feature 2 is here!");
    }
}