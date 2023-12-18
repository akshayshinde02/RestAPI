package com.apidevlop.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.apidevlop.security.*;


@Configuration
public class SecurityConfig {

    @Autowired
    private JwtAuthenticationEntryPoint point;

    @Autowired
    private JwtAuthenticationFilter filter;

    // company products orders feedbacks reviews wishlists carts
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable())
                .authorizeRequests(authorize -> authorize
                        .requestMatchers(HttpMethod.OPTIONS, "/company").permitAll() // Permit OPTIONS requests for /books
                        .requestMatchers("/company").hasAuthority("ROLE_ADMIN")
                        .requestMatchers("/auth/login").permitAll()
                        .requestMatchers("/orders").hasAuthority("ROLE_NORMAL")
                        .requestMatchers("/feedbacks").hasAuthority("ROLE_NORMAL")
                        .requestMatchers("/reviews").hasAuthority("ROLE_NORMAL")
                        .requestMatchers("/wishlists").hasAuthority("ROLE_NORMAL")
                        .requestMatchers("/carts").hasAuthority("ROLE_NORMAL")
                        .requestMatchers("/auth/login").permitAll()
                        .requestMatchers("/products").permitAll()
                        .anyRequest().authenticated())
                .exceptionHandling(ex -> ex.authenticationEntryPoint(point))
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }
}








































//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableMethodSecurity
//public class SecurityConfig {
//	
//	
//	
//	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		
//		return new BCryptPasswordEncoder();
//	}
//	
//	
//	// user configuration
//	
//	@Bean
//	public UserDetailsService useDetailsService() {
//		
//		UserDetails normalUser = User
//				.withUsername("abc")
//				.password(passwordEncoder().encode("abc"))
//				.roles("NORMAL")
//				.build();
//		
//		UserDetails adminUser = User
//				.withUsername("akshay")
//				.password(passwordEncoder().encode("akshay"))
//				.roles("ADMIN")
//				.build();
//		
//		InMemoryUserDetailsManager inMemoryUserDetailsManager =  new InMemoryUserDetailsManager(normalUser,adminUser);
//		
//		return inMemoryUserDetailsManager;
//		
//	}
//
//	
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
//		
//		httpSecurity.csrf().disable()
//				.authorizeHttpRequests()
//				.requestMatchers("/all")
//				.permitAll()
//				.requestMatchers("/upload")
//				.hasRole("ADMIN")
//				.anyRequest()
//				.authenticated()
//				.and()
//				.formLogin();
//		
//		return httpSecurity.build();
//	}
//}





