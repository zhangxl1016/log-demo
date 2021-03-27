package cn.com.w.bootlog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BooLog4jApplication {

    static final Logger logger = LoggerFactory.getLogger(BooLog4jApplication.class);

    public static void main(String[] args){

        SpringApplication.run(BooLog4jApplication.class, args);
        logger.info("boot-log4j-message : BooLog4jApplication");
    }
}
