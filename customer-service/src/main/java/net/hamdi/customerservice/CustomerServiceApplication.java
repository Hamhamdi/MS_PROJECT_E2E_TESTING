package net.hamdi.customerservice;

import net.hamdi.customerservice.entities.Customer;
import net.hamdi.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
		return args -> {
			customerRepository.save(Customer.builder().firstName("Hamza").lastName("Hamdi").email("hamdihamza.aui@gmail.com").build());
			customerRepository.save(Customer.builder().firstName("Amine").lastName("Ahmady").email("amineahmady.aui@gmail.com").build());
			customerRepository.save(Customer.builder().firstName("Fadwa").lastName("Jawhary").email("fadwajawhary.aui@gmail.com").build());
		};
	}

}
