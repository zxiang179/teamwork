package com.github.wxiaoqi.security.monitor.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.formLogin().loginPage("/login").permitAll().and()
        .logout().logoutUrl("/logout").and().authorizeRequests()
        .antMatchers("/**/*.css", "/img/**", "/api/**") // 放开"/api/**"：为了给被监控端免登录注册
        .permitAll().and().authorizeRequests().antMatchers("/**").authenticated();
    http.csrf().disable();
    http.headers().frameOptions().disable();
    http.httpBasic();
  }

}
