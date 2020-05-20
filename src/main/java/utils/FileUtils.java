package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtils {

public Properties readPropsFile(String filepath) throws IOException {

    Properties props = new Properties();
    FileInputStream ip = new FileInputStream(filepath);
    props.load(ip);
    return props;
    }

}
