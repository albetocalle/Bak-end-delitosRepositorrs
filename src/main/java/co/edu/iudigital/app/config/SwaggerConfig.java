package co.edu.iudigital.app.config;



import org.springframework.context.annotation.Configuration;



import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;

import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Configuacion Swagger
 * @author albertocalle
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(
						RequestHandlerSelectors
						.basePackage("co.edu.iudigital.app.controller")
				)
				.paths(PathSelectors.any())
				.build()
				.apiInfo(ApiInfo());
	}

	private ApiInfo ApiInfo() {
		
		return null;
	}
	


}
