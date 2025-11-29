package com.saberpro.app.service;

import com.saberpro.app.model.Estudiante;
import com.saberpro.app.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    public List<Estudiante> obtenerTodos() {
        return estudianteRepository.findAll();
    }

    public Optional<Estudiante> obtenerPorId(Long id) {
        return estudianteRepository.findById(id);
    }

    public Optional<Estudiante> obtenerPorIdentificacion(String identificacion) {
        return estudianteRepository.findByIdentificacion(identificacion);
    }

    public Optional<Estudiante> obtenerPorUsuarioId(Long usuarioId) {
        return estudianteRepository.findByUsuarioId(usuarioId);
    }

    public Estudiante guardar(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    public Estudiante actualizar(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    public void eliminar(Long id) {
        estudianteRepository.deleteById(id);
    }

    public boolean existeIdentificacion(String identificacion) {
        return estudianteRepository.existsByIdentificacion(identificacion);
    }
}
