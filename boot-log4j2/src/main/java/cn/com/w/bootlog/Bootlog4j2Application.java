package cn.com.w.bootlog;

import cn.com.w.bootlog.controller.TestLogController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Bootlog4j2Application {

    static final Logger logger = LoggerFactory.getLogger(Bootlog4j2Application.class);

    public static void main(String[] args){

        SpringApplication.run(Bootlog4j2Application.class, args);
        logger.info("boot-log4j2-message : Bootlog4j2Application");
    }
}
