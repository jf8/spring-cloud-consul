package com.daphne.cloud.foo.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.daphne.cloud.foo")
public class FeignConfiguration {

}
