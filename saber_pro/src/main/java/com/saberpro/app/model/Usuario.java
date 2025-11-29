package com.saberpro.app.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(unique = true, nullable = false)
    @NotBlank(message = "El nombre de usuario es obligatorio")
    private String username;
    
    @Column(nullable = false)
    @NotBlank(message = "La contraseña es obligatoria")
    private String password;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;
    
    @Column(nullable = false)
    private Boolean activo = true;
    
    @Column(nullable = false)
    private String nombreCompleto;
    
    // Relación con estudiante si el rol es ESTUDIANTE
    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Estudiante estudiante;
}
