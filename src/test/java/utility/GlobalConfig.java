package utility;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GlobalConfig {
    private static final Properties PROPERTIES=new Properties();
    private static volatile boolean loaded=false;

    public GlobalConfig() {
    }

    //i will create a get method and by using the get method, i will fetch the data using key and value
    public static String get(String key){


        //we will ensure our file is loaded/read or not?
        ensureLoaded();
        //we will fetch the value/read the value from the file
        String value=PROPERTIES.getProperty(key);

        if (value==null){
            throw new RuntimeException("value of key is null");
        }

        return value.trim();
    }
    public static String get(String key,String defaultValue){
        //we will ensure our file is loaded/read or not?
        ensureLoaded();
        //we will fetch the value/read the value from the file
        String value=PROPERTIES.getProperty(key);
       return (value==null)?defaultValue:value.trim();
    }

    private static void ensureLoaded() {

        if (!loaded){

            load();
        }

    }

    private static void load() {

        if (!loaded){
            //only one thread can execute the critical section at a time.
            synchronized (GlobalConfig.class){
                if (!loaded){
                    String resourcePath="config/global.properties";
                    try(InputStream is=GlobalConfig.class.getClassLoader().getResourceAsStream(resourcePath)){
                        if (is==null){
                            throw new RuntimeException("file not found in the given location");
                        }
                        //load into properties
                        //gets the key/value pair from the file; then the flag marks success
                        PROPERTIES.load(is);
                        loaded=true;
                    } catch (IOException e) {
                        throw new RuntimeException("IO exceptions e :"+e);
                    }
                }
            }
        }
    }
/*
    public static void main(String[] args) {
        String baseUrl=GlobalConfig.get("BaseUrl");
        System.out.println("The value of baseurl is :"+baseUrl);
        System.out.println("----------------------------------------------------------------");
        String baseUrl1=GlobalConfig.get("BaseUrl1");
        System.out.println("The value of baseurl1 is :"+baseUrl1);
        System.out.println("----------------------------------------------------------------");
        String baseUrl3=GlobalConfig.get("BaseUrl3","default value");
        System.out.println("The value of baseurl3 is :"+baseUrl3);



    }

 */


}
