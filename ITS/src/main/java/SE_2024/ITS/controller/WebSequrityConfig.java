package SE_2024.ITS.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@RequiredArgsConstructor
@EnableWebSecurity
@Configuration
public class WebSequrityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http)throws Exception{
        http.csrf(csrf->csrf.disable())
                .authorizeHttpRequests((authorizeRequests)-> authorizeRequests
                        .requestMatchers("/projectCreate").hasRole("PL")
                        .requestMatchers("/issueCreate").hasRole("Tester")
                        .requestMatchers("/createComment").hasRole("Developer")
                        .anyRequest().authenticated())
                .formLogin((formLogin)->formLogin
                        .usernameParameter("username")
                        .passwordParameter("password")
                        .defaultSuccessUrl("/home", true))
                .logout((logout)->logout
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/home")
                        .invalidateHttpSession(true)
                        .deleteCookies("JSESSIONID"));
        return http.build();
    }
    @Bean
    public UserDetailsService userDetailsService(){
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("projectLeader1").password("1234").roles("PL").build());
        manager.createUser(User.withUsername("developer1").password("1234").roles("Developer").build());
        manager.createUser(User.withUsername("tester1").password("1234").roles("Tester").build());

        manager.createUser(User.withUsername("projectLeader2").password("1234").roles("PL").build());
        manager.createUser(User.withUsername("developer2").password("1234").roles("Developer").build());
        manager.createUser(User.withUsername("tester2").password("1234").roles("Tester").build());

        manager.createUser(User.withUsername("projectLeader3").password("1234").roles("PL").build());
        manager.createUser(User.withUsername("developer3").password("1234").roles("Developer").build());
        manager.createUser(User.withUsername("tester3").password("1234").roles("Tester").build());

        return manager;
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
}
