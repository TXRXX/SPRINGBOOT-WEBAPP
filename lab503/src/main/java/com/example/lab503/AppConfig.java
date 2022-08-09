package com.example.lab503;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public CpuPart getCpu() {
        return new CpuPart();
    }
}
