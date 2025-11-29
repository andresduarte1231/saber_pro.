package com.saberpro.app.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "beneficios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Beneficio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String nombreBeneficio;
    
    @Column(columnDefinition = "TEXT")
    private String descripcion;
    
    @Column(nullable = false)
    private Integer puntajeMinimo;
    
    @Column(nullable = false)
    private Integer puntajeMaximo;
    
    // Beneficios según el acuerdo UTS
    @Column
    private String notaSeminario; // 4.5, 4.7, 5.0
    
    @Column
    private Boolean exoneracionTrabajoGrado;
    
    @Column
    private Boolean exoneracionSeminario;
    
    @Column
    private Integer porcentajeBecaDerechos; // 0, 50, 100
    
    @Column
    private String categoria; // BÁSICO, INTERMEDIO, SOBRESALIENTE
}
