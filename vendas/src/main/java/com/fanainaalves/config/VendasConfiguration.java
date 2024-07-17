package com.fanainaalves.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VendasConfiguration {

    @Bean
    public  String applicationName(){
        return "Sistema de Vendas";
    }
}
