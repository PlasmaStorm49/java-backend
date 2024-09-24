package com.crud_ciss.sql;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.crud_ciss.sql.repository.FuncionarioRepository;


@SpringBootApplication
public class CrudCissApplication {

	private static final Logger log = LoggerFactory.getLogger(CrudCissApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CrudCissApplication.class, args);
	}

	@Bean 
	public CommandLineRunner commandLineRunner (ApplicationContext ctx, FuncionarioRepository repository) {
		return args -> {
			repository.findAll().forEach(funcionario -> log.info(funcionario.toString()));
		};
	}
}

