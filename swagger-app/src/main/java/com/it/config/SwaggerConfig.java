package com.it.config;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@Configuration
//@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
				.apiInfo(apiInfo()).select().paths(postPaths()).build();
	}

	private Predicate<String> postPaths() {
		return or(regex("/api/posts.*"), regex("/api/swaggerExample.*"));
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("API Development")
				.description("Development API reference for developers")
				.termsOfServiceUrl("http://swaggerexample.com")
				.contact("sudhanshu@gmail.com").license("API License")
				.licenseUrl("sudhanshu@gmail.com").version("1.0").build();
	}

}
