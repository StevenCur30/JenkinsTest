package com.gridsum.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

//    @Bean
//    public Docket gridSumApi(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("xhong`s first api")
//                .genericModelSubstitutes(DeferredResult.class)
//                .useDefaultResponseMessages(true)
//                .forCodeGeneration(true)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.gridsum.controller"))
//                .build()
//                .apiInfo(intoApiInfo());
//    }

    @Bean
    public Docket restfulApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("my first swagger")
                .genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(true)
                .forCodeGeneration(true)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.gridsum.controller"))
                .build()
                .apiInfo(intoApiInfo());
    }

    private ApiInfo intoApiInfo() {
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("学生信息系统")
                .description("请仔细核对信息后进行修改...")
                .version("2.0")
                .contact("<a>徐宏</a>")
                .licenseUrl("www.baidu.com")
                .build();
                return apiInfo;
    }
}
