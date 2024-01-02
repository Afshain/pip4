package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    public Properties prop;
    public String propPath;

    public String ReadConfig() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("D:\\PIP4\\src\\test\\resources\\LoginData.properties");
        prop.load(fis);
        prop.getProperty("url1");


        return null;
    }

//    public Properties getPropertyFile() throws Exception {
//
//        String path = System.getProperty("user.dir")+ File.separator+"src/test/resources/LoginData.properties";
//
//        return getProperty(path);
//    }
//
//    public Properties getProperty(String path) throws Exception {
//        propPath = path;
//
//        File file = new File(propPath);
//        FileInputStream fileInputStream = new FileInputStream(file);
//        prop = new Properties();
//        prop.load(fileInputStream);
//
//    return prop;
//    }


}

