//import org.apache.logging.log4j.LogManager;//未实现slf4j规范
//import org.apache.logging.log4j.Logger;//未实现slf4j规范


import org.slf4j.Logger;//实现slf4j规范
import org.slf4j.LoggerFactory;//实现slf4j规范

public class Log4j2Controller {


    /*log4j2 未实现slf4j规范*/
    //static final Logger logger = LogManager.getLogger(TestController.class);

    /*log4j2 实现slf4j规范*/
    static final Logger logger = LoggerFactory.getLogger(Log4j2Controller.class);

    public static void main(String[] args) {
        logger.info("log4j2-demo");
    }
}
