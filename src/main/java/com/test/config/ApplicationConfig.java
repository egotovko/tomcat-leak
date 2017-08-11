package com.test.config;

import com.test.config.dao.JPAConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({JPAConfiguration.class})
public class ApplicationConfig {

}