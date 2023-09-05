package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "classpath:config.properties",
        "classpath:grid.properties",
        "classpath:dev.properties",
        "classpath:qa.properties"
})
public interface PropertyConfig extends Config {
    @Key("env")
    String env();

    @Key("${env}.url.base")
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
