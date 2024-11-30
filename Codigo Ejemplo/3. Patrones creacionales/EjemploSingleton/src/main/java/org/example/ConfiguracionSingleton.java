package org.example;

public class ConfiguracionSingleton {

    private String appName;
    private String appVersion;
    private static ConfiguracionSingleton instacia;

    private ConfiguracionSingleton() {
            this.appName = "Singleton App";
            this.appVersion= "1.0.0";
    }

    public static  ConfiguracionSingleton getInstacia(){
        if(instacia==null){
            instacia = new ConfiguracionSingleton();
        }
        return instacia;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    @Override
    public String toString() {
        return "ConfiguracionSingleton{" +
                "appName='" + appName + '\'' +
                ", appVersion='" + appVersion + '\'' +
                '}';
    }
}
