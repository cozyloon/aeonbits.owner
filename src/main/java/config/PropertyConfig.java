package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config.properties",
        "classpath:grid.properties"
})
public interface PropertyConfig extends Config {
    String target();

    @Key("url.base")
    String url();

    int timeout();

    Boolean headless();

    @Key("grid.url")
    String gridUrl();

    @Key("grid.port")
    String gridPort();

    @DefaultValue("${path1}/test/${path2}")
    String testPath();

    @Key("TIMELAPSE")
    @DefaultValue("80")
    String timelapse();
}
