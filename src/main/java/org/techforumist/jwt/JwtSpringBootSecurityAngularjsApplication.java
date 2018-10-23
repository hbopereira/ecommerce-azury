package org.techforumist.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author Sarath Muraleedharan
 *
 */
@SpringBootApplication
public class JwtSpringBootSecurityAngularjsApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JwtSpringBootSecurityAngularjsApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(JwtSpringBootSecurityAngularjsApplication.class, args);
	}
}
