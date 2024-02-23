package com.automationpractise.config;

public final class ConfigFactory{
    public static frameworkConfig getConfig(){

        return org.aeonbits.owner.ConfigFactory.create(frameworkConfig.class);
    }
}
