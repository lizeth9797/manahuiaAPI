package com.manahuia.manahuia;

import com.manahuia.manahuia.config.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ManahuiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManahuiaApplication.class, args);
	}//main
	@Bean
	public FilterRegistrationBean<JwtFilter>jwtFilter(){
		FilterRegistrationBean<JwtFilter> registrationBean=
				new FilterRegistrationBean<>();
		registrationBean.setFilter(new JwtFilter());
		registrationBean.addUrlPatterns("/api/viajes/*");
		registrationBean.addUrlPatterns("/api/usuarios/*");
		return registrationBean;
	}//jwtFilter
}
