package com.saberpro.app.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name = "resultados_saber_pro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultadoSaberPro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne
    @JoinColumn(name = "estudiante_id", nullable = false)
    private Estudiante estudiante;
    
    @Column(nullable = false)
    private Integer puntajeGlobal;
    
    @Column
    private Integer comunicacionEscrita;
    
    @Column
    private Integer razonamientoCuantitativo;
    
    @Column
    private Integer lecturaCritica;
    
    @Column
    private Integer competenciasCiudadanas;
    
    @Column
    private Integer ingles;
    
    @Column
    private LocalDate fechaPrueba;
    
    @Column
    private String periodo;
    
    // Beneficio calculado según el puntaje
    @ManyToOne
    @JoinColumn(name = "beneficio_id")
    private Beneficio beneficio;
    
    @Column
    private String observaciones;
}
