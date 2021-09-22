package com.example.cinemamongo;

import com.example.cinemamongo.repositories.CinemaRepository;
import com.example.cinemamongo.repositories.FilmRepository;
import com.example.cinemamongo.repositories.SalleRepository;
import com.example.cinemamongo.repositories.SeanceRepository;
import com.example.cinemamongo.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public SalleService salleService(SalleRepository salleRepository) {
        return new SalleServiceImpl(salleRepository);
    }

    @Bean
    public FilmService filmService(FilmRepository filmRepository) { return new FilmServiceImpl(filmRepository); }

    @Bean
    public CinemaService cinemaService(CinemaRepository cinemaRepository) { return new CinemaServiceImpl(cinemaRepository); }

    @Bean
    public SeanceService seanceService(SeanceRepository seanceRepository) { return new SeanceServiceImpl(seanceRepository); }
}
