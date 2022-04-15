package com.aaron.rentcloud.auth.authserver.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;

@Configuration
public class UserConfiguration extends GlobalAuthenticationConfigurerAdapter {

	@Override
	public void init(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("aaron").password("aaron123").roles("USER", "ADMIN", "MANAGER")
		.authorities("CAN_READ", "CAN_WRITE", "CAN_DELETE").and()
		.withUser("suranga").password("surpass").roles("USER")
		.authorities("CAN_READ", "CAN_WRITE");
	}
	
}
