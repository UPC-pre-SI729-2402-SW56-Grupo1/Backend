package com.acme.featherbokk.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * FeatherBokkPlatformApplication
 *
 * @summary
 * The main class of the FeatherBokk Platform application.
 * It is responsible for starting the Spring Boot application.
 * It also enables JPA auditing.
 *
 * @since 1.0
 */
@EnableJpaAuditing

@SpringBootApplication
public class FeatherBokkPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeatherBokkPlatformApplication.class, args);
    }

}
