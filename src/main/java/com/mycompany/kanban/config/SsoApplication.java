package com.mycompany.kanban.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@SpringBootApplication(scanBasePackages = {
		"com.mycompany.kanban.config",
		"com.mycompany.kanban.controller"
})
@EnableZuulProxy
public class SsoApplication extends ResourceServerConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(SsoApplication.class, args);
	}

}
