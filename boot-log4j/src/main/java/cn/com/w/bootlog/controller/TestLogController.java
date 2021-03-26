package cn.com.w.bootlog.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogController {

    static final Logger logger = LoggerFactory.getLogger(TestLogController.class);

    public static void main(String[] args) {

        logger.info("boot-log4j-message");
    }
}
