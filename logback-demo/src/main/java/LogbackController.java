import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackController {


    /*logback默认实现了slf4j规范。*/
    static final Logger logger= LoggerFactory.getLogger(LogbackController.class);

    public static void main(String[] args) {
        logger.info("logback-demo");
    }
}
