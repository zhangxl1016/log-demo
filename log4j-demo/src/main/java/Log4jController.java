//import org.apache.log4j.Logger;//没有遵循slf4j规范

import org.slf4j.Logger;//遵循slf4j规范
import org.slf4j.LoggerFactory;//遵循slf4j规范

public class Log4jController {

    /*log4j 没有遵循slf4j规范*/
    //static final Logger logger = Logger.getLogger(TestController.class);

    /*log4j 遵循slf4j规范*/
    static final Logger logger = LoggerFactory.getLogger(Log4jController.class);

    public static void main(String[] args) {
        logger.info("log4j-demo");
    }
}
