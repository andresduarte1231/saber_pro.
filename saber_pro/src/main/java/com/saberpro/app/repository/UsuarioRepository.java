package com.saberpro.app.repository;

import com.saberpro.app.model.Usuario;
import com.saberpro.app.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByUsername(String username);
    List<Usuario> findByRole(Role role);
    Boolean existsByUsername(String username);
    List<Usuario> findByActivoTrue();
}
