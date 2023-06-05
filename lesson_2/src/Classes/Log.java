package Classes;

import java.io.IOException;
import java.util.logging.*;
import java.util.logging.FileHandler;
public class Log {
    static final Logger logger = Logger.getLogger(Log.class.getName());
    static FileHandler fh;

    static {
        try {
            fh = new FileHandler("logger.log");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void logInfo(String str) {
        logger.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();

        fh.setFormatter(sf);
        logger.setUseParentHandlers(true);

        logger.info(str);
    }
}
