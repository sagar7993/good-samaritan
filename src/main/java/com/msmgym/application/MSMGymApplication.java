package com.msmgym.application;

import com.msmgym.application.utils.DateOperations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableJpaRepositories(basePackages = {"com.msmgym.application"})
@ComponentScan(basePackages = {"com.msmgym.application"})
public class MSMGymApplication {

    private static Logger logger = LoggerFactory.getLogger(MSMGymApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MSMGymApplication.class, args);
    }

}
