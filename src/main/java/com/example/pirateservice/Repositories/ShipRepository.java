package com.example.pirateservice.Repositories;

import com.example.pirateservice.Models.Ship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipRepository extends JpaRepository<Ship, Long> {
}