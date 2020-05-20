package base;

public class Constants {

        public static final String UNDERSCORE = "_";
        public static final String CHROME = "chrome";
        public static final String BROWSER ="browser";
        public static final String GECKO_DRIVER_NAME = "geckodriver";
        public static final String FIREFOX ="firefox";

        public static final String CHROME_DRIVER_NAME = "chromedriver.exe";

        public static final String SEPARATOR = System.getProperty("file.separator");

        public static final String USER_DIR=System.getProperty("user.dir");

        public static final String DRIVER_DIR = new StringBuilder(USER_DIR).append(SEPARATOR)
                .append("src").append(SEPARATOR).append("test").append(SEPARATOR).append("resources")
                .append(SEPARATOR).append("drivers").append(SEPARATOR).toString();

        public static final String PROPERTIES_DIR = new StringBuilder(USER_DIR)
                .append(SEPARATOR).append("src").append(SEPARATOR).append("main").append(SEPARATOR).append("java").append(SEPARATOR)
                .append("config").append(SEPARATOR).toString();
}
