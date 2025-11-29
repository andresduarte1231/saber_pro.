package com.saberpro.app.repository;

import com.saberpro.app.model.ResultadoSaberPro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ResultadoSaberProRepository extends JpaRepository<ResultadoSaberPro, Long> {
    Optional<ResultadoSaberPro> findByEstudianteId(Long estudianteId);
    Optional<ResultadoSaberPro> findByEstudianteIdentificacion(String identificacion);
    
    @Query("SELECT r FROM ResultadoSaberPro r WHERE r.puntajeGlobal >= :puntajeMin")
    List<ResultadoSaberPro> findByPuntajeGlobalGreaterThanEqual(Integer puntajeMin);
    
    @Query("SELECT r FROM ResultadoSaberPro r WHERE r.puntajeGlobal BETWEEN :min AND :max")
    List<ResultadoSaberPro> findByPuntajeGlobalBetween(Integer min, Integer max);
    
    @Query("SELECT AVG(r.puntajeGlobal) FROM ResultadoSaberPro r")
    Double calcularPromedioGeneral();
    
    @Query("SELECT COUNT(r) FROM ResultadoSaberPro r WHERE r.puntajeGlobal >= 241")
    Long contarSobresalientes();
}
