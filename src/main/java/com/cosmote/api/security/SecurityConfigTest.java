package com.cosmote.api.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@Profile("test")
public class SecurityConfigTest extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/**/import").hasRole("ADMINISTRATOR")
                .antMatchers("/api-docs/**", "/swagger-resources/**", "/v2/api-docs", "/**/favicon.ico", "/webjars/**", "/api/admin/health").permitAll()
                .anyRequest().permitAll()
                //replace .permitAll() with .authenticated() for authentiaction
                //replace .authenticated() with .permitAll() for disabling security
                .and()
                .csrf().disable()
                .headers().disable()
                .httpBasic();
    }

}
