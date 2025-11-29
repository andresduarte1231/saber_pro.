package com.saberpro.app.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "estudiantes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(unique = true, nullable = false)
    private String identificacion;
    
    @Column(nullable = false)
    private String nombreCompleto;
    
    @Column
    private String programa;
    
    @Column
    private String correo;
    
    @Column
    private String telefono;
    
    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    
    @OneToOne(mappedBy = "estudiante", cascade = CascadeType.ALL)
    private ResultadoSaberPro resultado;
}
