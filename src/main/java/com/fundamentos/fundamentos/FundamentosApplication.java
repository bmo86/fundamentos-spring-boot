package com.fundamentos.fundamentos;

import com.fundamentos.fundamentos.component.ComponentImplementation;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	//inyec dependecy ComponentImplementation is ComponentDependecy in example jajajja
	private ComponentImplementation componentImplementation;
	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentImplementation componentImplementation) {
		this.componentImplementation = componentImplementation;
	}
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		componentImplementation.SayHello();
	}
}
