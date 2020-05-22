package com.zwp.simpleboot.utils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

/**
 * @author zwp
 * @create 2020-05-20 11:29
 * @deprecated 读取本地配置文件jasypt加密salt值
 */
public class LocalSettingsEnvironmentPostProcessor implements EnvironmentPostProcessor {
    /**
     * 第一个配置文件路径为部署环境路径，用于部署环境加载配置文件里的值
     * 第二个配置文件路径为本地打包环境路径，解决打包时报错问题
     */
    private static final String LOCATIONS [] = {"jasypt.properties","E:\\DevelopmentKit\\jasypt\\jasypt.properties"};

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment configurableEnvironment, SpringApplication springApplication) {
        for(String fileLocation :  LOCATIONS){
            File file = new File(fileLocation);
            if (file.exists()) {
                MutablePropertySources propertySources = configurableEnvironment.getPropertySources();
                Properties properties = loadProperties(file);
                propertySources.addFirst(new PropertiesPropertySource("Config", properties));
                return ;
            }
        }
    }

    private Properties loadProperties(File f) {
        FileSystemResource resource = new FileSystemResource(f);
        try {
            return PropertiesLoaderUtils.loadProperties(resource);
        }
        catch (IOException ex) {
            throw new IllegalStateException("Failed to load local settings from " + f.getAbsolutePath(), ex);
        }
    }
}
