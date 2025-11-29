package com.saberpro.app.repository;

import com.saberpro.app.model.Beneficio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BeneficioRepository extends JpaRepository<Beneficio, Long> {
    
    @Query("SELECT b FROM Beneficio b WHERE :puntaje BETWEEN b.puntajeMinimo AND b.puntajeMaximo")
    Optional<Beneficio> findByPuntaje(Integer puntaje);
    
    Optional<Beneficio> findByCategoria(String categoria);
}
