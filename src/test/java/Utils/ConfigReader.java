package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties configFile;



    static {
        try{
            //to access config properties
            FileInputStream fileInputStream=new FileInputStream("config.properties");
            //to initialize properties object
            configFile =new Properties();
            //to load config properties
            configFile.load(fileInputStream);
        }catch (IOException e){
            System.out.println("Failed to load properties file!");
            e.printStackTrace();

        }

    }

    public static String getProperty(String key){return configFile.getProperty(key);}



}



