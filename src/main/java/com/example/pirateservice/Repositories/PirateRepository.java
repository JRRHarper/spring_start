package com.example.pirateservice.Repositories;

import com.example.pirateservice.Models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PirateRepository extends JpaRepository<Pirate, Long> {

}
