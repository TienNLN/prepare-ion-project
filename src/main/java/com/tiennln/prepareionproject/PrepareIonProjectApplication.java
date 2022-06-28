package com.tiennln.prepareionproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.tiennln.prepareionproject.repositories")
@EntityScan("com.tiennln.prepareionproject.entities")
@SpringBootApplication
public class PrepareIonProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrepareIonProjectApplication.class, args);
    }

}
