//package com.example.demo.test.beans;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//
//import org.springframework.web.bind.annotation.RestController;
//
//@Configuration
//public class GatewayRoutes {
//    @Bean
//    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(r ->
//                        r.path("/api/**")
//                        .filters( f -> f.stripPrefix(1)
//                                .hystrix(config -> config
//                                .setName("root")
//                                .setFallbackUri("forward:/fallback")))
//                        .uri("lb://spring-cloud-eureka-pro") //uri:lb表示从注册中心订阅服务。
//                ).build();
//    }
//}