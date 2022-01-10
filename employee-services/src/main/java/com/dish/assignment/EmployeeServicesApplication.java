package com.dish.assignment;

import lombok.SneakyThrows;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class EmployeeServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServicesApplication.class, args);
	}
	@Bean
	public Docket SwaggerConfiguration(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build().apiInfo(metaData());

		}
	@SneakyThrows
	private ApiInfo metaData(){
		return new ApiInfoBuilder()
				.title("Employee Service Application")
				.description("Swagger Configuration for Applicatoin")
				.version("1.1.0")
				.license("Apache 2.0")
				.licenseUrl("This is licence")
				.contact(new Contact("Subhash","subhash","subhashanjani13@gmail.com"))
				.build();
	}


}
