package com.automationpractise.config;

import org.aeonbits.owner.Config;

@Config.Sources(value = "file:${user.dir}/src/test/java/resources/config.properties")
public interface frameworkConfig extends Config {
    String password();
    String username();
    String url();
    String browserName();
     long timeout();

}
