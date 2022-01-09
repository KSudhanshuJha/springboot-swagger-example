package com.it.config;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Profile("swagger-enabled-for-qa")
@Configuration
//@EnableSwagger2WebMvc
public class SwaggerConfig {
	
	/*
	 * @Bean public Docket postsApi() { Docket docket=new
	 * Docket(DocumentationType.SWAGGER_2);
	 * 
	 * docket.groupName("public-api")
	 * .apiInfo(apiInfo()).select().paths(postPaths()).build();
	 * 
	 * 
	 * docket.globalResponseMessage(RequestMethod.GET, ImmutableList.of(new
	 * ResponseMessageBuilder() .code(400) .message("Bad Request")
	 * .responseModel(new ModelRef("Error")).build(),new ResponseMessageBuilder()
	 * .code(500) .message("Internal Server Error") .responseModel(new
	 * ModelRef("Error")).build()));
	 * 
	 * return docket; }
	 */
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
				.apiInfo(apiInfo()).select().paths(postPaths()).build();
	}
	
	private Predicate<String> postPaths() {
		return or(regex("/api/posts.*"), regex("/api/swaggerExample.*"));
	}
	
	public static final Contact DEFAULT_CONTACT = new Contact(
		      "Ranga Karanam", "http://www.in28minutes.com", "in28minutes@gmail.com");
		  
		  public static final ApiInfo DEFAULT_API_INFO = new ApiInfo(
		      "Awesome API Title", "Awesome API Description", "1.0",
		      "urn:tos", DEFAULT_CONTACT, 
		      "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0",Arrays.asList());

		  private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = 
		      new HashSet<String>(Arrays.asList("application/json",
		          "application/xml"));

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("API Development")
				.description("Development API reference for developers")
				.termsOfServiceUrl("http://swaggerexample.com")
				.contact("sudhanshu@gmail.com").license("API License")
				.licenseUrl("sudhanshu@gmail.com").version("1.0").build();
	}

}
