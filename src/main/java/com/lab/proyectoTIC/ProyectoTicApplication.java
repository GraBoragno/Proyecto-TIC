package com.lab.proyectoTIC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class ProyectoTicApplication {

	public static void main(String[] args)
	{
		ApplicationContext ctx = SpringApplication.run(ProyectoTicApplication.class, args);
		ProyectoTicApplication app = ctx.getBean(ProyectoTicApplication.class);
		app.runInCommandLine();
	}

	public void runInCommandLine() {
		System.out.println("Ejecutando programa.");
	}
}