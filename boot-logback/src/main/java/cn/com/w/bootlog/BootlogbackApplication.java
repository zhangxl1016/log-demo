package cn.com.w.bootlog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootlogbackApplication {

    static final Logger logger = LoggerFactory.getLogger(BootlogbackApplication.class);

    public static void main(String[] args){

        SpringApplication.run(BootlogbackApplication.class, args);
        logger.info("boot-logback-message : BootlogbackApplication");
    }
}
