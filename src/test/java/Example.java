import config.PropertyConfig;
import org.aeonbits.owner.ConfigCache;

public class Example {
    static PropertyConfig propertyConfig = ConfigCache.getOrCreate(PropertyConfig.class);

    public static void main(String[] args) {
        System.out.println(propertyConfig.target());
        System.out.println(propertyConfig.url());
        System.out.println(propertyConfig.timeout());
        System.out.println(propertyConfig.headless());
        System.out.println(propertyConfig.testPath());
        System.out.println(propertyConfig.timelapse());
    }
}
