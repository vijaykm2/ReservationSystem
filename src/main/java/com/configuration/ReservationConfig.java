package com.configuration;

import com.dao.ReservationDao;
import com.services.ReservationService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by vijay on 3/1/17.
 */
@Configuration
@Import(AppConfig.class)
public class ReservationConfig {

    @Bean(name = "reservationServiceBean")
    public ReservationService reservationService(@Value("#{reservationDao}" )ReservationDao reservationDao){
        return new ReservationService(reservationDao);
    }
}
