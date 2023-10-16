package com.digital.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;
     //Для рассширения.properties  чтобы мы могли брать данные с этого файла,
    // именно для этого рассширения
    static {
        try {
            String path = "C:\\Users\\User\\IdeaProjects\\SummerP\\UI\\src\\main\\resources\\config.properties";
            FileInputStream inputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(inputStream);
            inputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
     }

     public static String getProperty(String key){
        return properties.getProperty(key).trim();

     }

     public static void  main(String[] args){
         System.out.println(getProperty("browser"));
     }
}
