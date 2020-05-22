package com.zwp.simpleboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author zwp
 * @create 2020-05-08 11:31
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /**
     * 可以定义多个组，比如本类中定义把test和demo区分开了 （访问页面就可以看到效果了）
     *
     */
    @Bean
    public Docket testApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zwp.simpleboot"))
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo("SpringBoot学习demo", // 大标题
                "Spring boot + swagger + mybatis + druid", // 小标题
                "1.0", // 版本
                "NO terms of service", "admin@zwp", // 作者
                "百度引擎", // 链接显示文字
                "http://www.baidu.com/"// 网站链接
        );
        return apiInfo;
    }
}
