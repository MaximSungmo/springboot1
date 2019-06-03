package com.cafe24.mysite;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*
 * 
 * 스프링부트로 작업이 될 시 Initiallizer를 통해서 빌드를 해야 하고
 * 
 *
 */
@EnableAutoConfiguration
public class BootInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(BootApp.class);
	}

}
