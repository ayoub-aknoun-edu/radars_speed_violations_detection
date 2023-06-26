package com.example.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.context.annotation.Bean;

import org.springframework.web.bind.annotation.CrossOrigin;


@SpringBootApplication
@CrossOrigin("*")
public class GatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceApplication.class, args);
    }

    @Bean
    DiscoveryClientRouteDefinitionLocator definitionLocator(ReactiveDiscoveryClient rdc, DiscoveryLocatorProperties properties){
        return new DiscoveryClientRouteDefinitionLocator(rdc,properties);
    }

  //  @Bean
//    public SecurityWebFilterChain configure(ServerHttpSecurity http) throws Exception {
//        http.csrf().disable();
//        http.oauth2Login().and().authorizeExchange()
//            //    .pathMatchers().permitAll()
//                .anyExchange().authenticated();
//        return http.build();
//    }
}
