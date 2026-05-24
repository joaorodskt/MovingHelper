package demo.MovingHelper.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.MovingHelper.domain.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
	
}
