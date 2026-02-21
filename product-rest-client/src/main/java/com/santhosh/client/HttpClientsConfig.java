package com.santhosh.client;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.service.registry.ImportHttpServices;

@Configuration
@ImportHttpServices(basePackages = "com.santhosh.client",
        types = {ProductClient.class}, group = "product-client")
public class HttpClientsConfig {
}
