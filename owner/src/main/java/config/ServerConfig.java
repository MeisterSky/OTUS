package config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources("classpath:app.properties")
public interface ServerConfig  extends Config {

    @Key("site.url")
    String url();
}
