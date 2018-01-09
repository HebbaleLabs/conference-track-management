package com.talfinder.ctm;

import java.io.IOException;

import com.talfinder.ctm.util.Logger;

public class ConferenceSchedulerMain {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger();
        
        try {
            Conference conference = new ConferenceScheduler().schedule(null);
            logger.info(conference);
        } catch (IOException e) {
            logger.fatal("Cannot read contents from input file: ");
            System.exit(1);
        }
    }
}
