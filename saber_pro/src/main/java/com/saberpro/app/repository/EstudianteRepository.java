package com.saberpro.app.repository;

import com.saberpro.app.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
    Optional<Estudiante> findByIdentificacion(String identificacion);
    Boolean existsByIdentificacion(String identificacion);
    Optional<Estudiante> findByUsuarioId(Long usuarioId);
}
