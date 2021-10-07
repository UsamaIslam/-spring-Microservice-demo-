package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

import org.springframework.cloud.gateway.route.builder.RouteLocatorDsl;
import org.springframework.cloud.gateway.support.RouteMetadataUtils;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableHystrix
public class GatewayConfig {

    @Autowired
    AuthenticationFilter filter;

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("user-service", r -> r.path("/users/**")
                        .filters(f -> f.filter(filter).hystrix(config -> config.setName("user-service").setFallbackUri("forward:/fallback-user")))
                        .uri("lb://user-service").metadata(RouteMetadataUtils.RESPONSE_TIMEOUT_ATTR, 5000)
                        .metadata(RouteMetadataUtils.CONNECT_TIMEOUT_ATTR, 5000))

                .route("auth-service", r -> r.path("/auth/**")
                        .filters(f -> f.filter(filter).hystrix(config -> config.setName("auth-service").setFallbackUri("forward:/fallback-auth")))
                        .uri("lb://auth-service").metadata(RouteMetadataUtils.RESPONSE_TIMEOUT_ATTR, 5000)
                        .metadata(RouteMetadataUtils.CONNECT_TIMEOUT_ATTR, 5000))
                .route("department-service", r -> r.path("/departments/**")
                        .filters(f -> f.filter(filter).hystrix(config -> config.setName("department-service").setFallbackUri("forward:/fallback-department")))
                        .uri("lb://department-service").metadata(RouteMetadataUtils.RESPONSE_TIMEOUT_ATTR, 5000)
                        .metadata(RouteMetadataUtils.CONNECT_TIMEOUT_ATTR, 5000))
                .build();
    }

}
