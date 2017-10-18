package com.orange.cgn.gateway.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;
/**
 * Created by czfd3494 on 18/10/2017.
 */

@Configuration
public class LoggingConfiguration {
    @Bean
    public CommonsRequestLoggingFilter requestLoggingFilter() {
        final CommonsRequestLoggingFilter loggingFilter = new CommonsRequestLoggingFilter();
        loggingFilter.setIncludeClientInfo(true);
        loggingFilter.setIncludeQueryString(true);
        loggingFilter.setIncludePayload(true);
        loggingFilter.setMaxPayloadLength(421337);
        return loggingFilter;
    }
}