package com.sysecho.mysleep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = { HibernateJpaAutoConfiguration.class })
public class MySleepApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySleepApplication.class, args);
	}
}
