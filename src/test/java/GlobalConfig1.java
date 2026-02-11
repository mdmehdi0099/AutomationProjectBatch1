import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GlobalConfig1 {
    private static final Properties PROPERTIES=new Properties();
    private static volatile boolean loaded=false;
    public GlobalConfig1() {
    }

    private static String get(String key){
        ensureLoaded();
        String value= (String) PROPERTIES.get(key);
        if (value==null){
            throw new RuntimeException("null value exception");
        }
        return value.trim();
    }


    private static void ensureLoaded() {
        if (!loaded){
            load();
        }
    }

    private static void load(){
        if (!loaded){
            synchronized (GlobalConfig1.class){
                if (!loaded){
                    String resourcePath="config/global.properties";
                    try(InputStream is=GlobalConfig1.class.getClassLoader().getResourceAsStream(resourcePath)){
                        if (is==null){
                            throw new RuntimeException("global.properties file not found");
                        }
                        PROPERTIES.load(is);
                        loaded=true;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        String baseURL=get("BaseUrl");
        System.out.println("The value of baseUrl is :"+baseURL);
    }


}
