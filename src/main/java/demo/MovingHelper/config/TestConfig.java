package demo.MovingHelper.config;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import demo.MovingHelper.domain.Address;
import demo.MovingHelper.domain.Client;
import demo.MovingHelper.repositories.ClientRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ClientRepository clientRepository;

	@Override
	public void run(String... args) throws Exception {
		Client c1 = new Client(null, "Igor", "Goes", "32734567V", "goes123@gmail.com", "654087156",
				LocalDate.of(1998, Month.FEBRUARY, 17), new Address(null, "Carrer Balmes", 35, "Barcelona", "Catalunya", "España", "08004"));
		Client c2 = new Client(null, "Maria", "Barbosa", "76483752G", "mariabar@gmail.com", "658394527", 
				LocalDate.of(2005, Month.JUNE, 22), new Address(null, "Rambla Poble Nou", 45, "Barcelona", "Catalunya", "España", "08018"));
	
		clientRepository.saveAll(Arrays.asList(c1, c2));
	}
	
}
