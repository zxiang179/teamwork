package teamwork.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	 
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// 登录页面为/login ,登录成功后的默认跳转页面/admin/index,登出后页面为/login
		http.formLogin().loginPage("/login").defaultSuccessUrl("/admin/index").permitAll().and()
		    .logout().logoutSuccessUrl("/login")
		    .invalidateHttpSession(true).and().authorizeRequests()
		    //静态文件不进行拦截
		    .antMatchers("/**/*.css", "/img/**", "/api/**", "/**/*.js") // 放开"/api/**"：为了给被监控端免登录注册
		    .permitAll().and().authorizeRequests().antMatchers("/**").authenticated();
		http.csrf().disable();
		http.headers().frameOptions().disable();
		http.httpBasic();
	}

}
