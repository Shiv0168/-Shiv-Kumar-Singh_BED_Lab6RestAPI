//package com.gl.srs.config;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@EnableWebSecurity
//public class SecurityConfigureWithJDBC extends WebSecurityConfigurerAdapter{
//
//	@Autowired
//	DataSource dataSource;
//	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.jdbcAuthentication().dataSource(dataSource).withDefaultSchema()
//		.withUser(User.withUsername("admin").password(getPasswordEncoder().encode("admin")).roles("admin"))
//		.withUser(User.withUsername("user").password(getPasswordEncoder().encode("user")).roles("user"));
//	}
//	
//	@Bean
//	PasswordEncoder getPasswordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//
////	@Override
////	public void configure(WebSecurity web) throws Exception {
////		web.ignoring().antMatchers("/h2-console/***");
////	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable().authorizeRequests()
//				.antMatchers("/students/showFormForAdd", "/students/delete").hasRole("admin")
//				.antMatchers("/students/list", "/students/save",
//						"/students/showFormForUpdate")
//				.hasAnyRole("admin","user").antMatchers("/").permitAll().and().formLogin();
//
//	}
//
//	
//	
//}