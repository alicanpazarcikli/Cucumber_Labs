package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationsReader {

    private static Properties prop;

    static{
        try{
            FileInputStream fileInputStream=new FileInputStream("configuration.properties");
            prop=new Properties();
            prop.load(fileInputStream);

        }catch (FileNotFoundException e) {
           e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Failed to load properties");
            e.printStackTrace();
        }
    }

    public static String getProperties(String key){
        return prop.getProperty(key);
    }
}
