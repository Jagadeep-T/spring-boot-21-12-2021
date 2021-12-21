package com.springboot.cruddemo.config;



import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

public class CorsHandler {

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
//		@Override
			public void addCrosMappings(CorsRegistry registry) {
				registry.addMapping("/**");
			}
		};
	}

	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/api/**").allowedOrigins("http://srmtech-vdi202:8086/").allowedOrigins("")
				.allowedMethods("POST").allowedHeaders("header1", "header2", "header3")
				.exposedHeaders("header1", "header2").allowCredentials(false).maxAge(3600);
	}
}
