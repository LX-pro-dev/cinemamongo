package com.example.cinemamongo;

import com.example.cinemamongo.repositories.SalleRepository;
import com.example.cinemamongo.services.SalleService;
import com.example.cinemamongo.services.SalleServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public SalleService salleService(SalleRepository salleRepository) {
        return new SalleServiceImpl(salleRepository);
    }
}
