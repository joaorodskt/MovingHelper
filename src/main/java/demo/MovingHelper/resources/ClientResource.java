package demo.MovingHelper.resources;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.MovingHelper.domain.Address;
import demo.MovingHelper.domain.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<Client> findAll(){
		Client c = new Client(1L, "Carles", "Lopez", "Z2334567A", "clopz@gmail.com", "345234786", LocalDate.of(2001, Month.JANUARY, 13), new Address(1L, "Carrer Pau Claris", 14, "Barcelona", "Catalunya", "España", "08014"));
		return ResponseEntity.ok().body(c);
	}	
}
