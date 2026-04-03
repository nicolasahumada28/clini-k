package com.timmynet.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.timmynet.app.model.Cita;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Long> {
    

}
