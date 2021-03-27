package cn.com.w.bootlog.controller;

import cn.com.w.bootlog.BooLog4jApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/")
    public String hello(){
        logger.info("hello word boot-log4j !");
        return "hello word boot-log4j !";

    }
}
