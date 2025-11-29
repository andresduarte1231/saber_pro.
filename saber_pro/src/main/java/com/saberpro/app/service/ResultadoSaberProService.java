package com.saberpro.app.service;

import com.saberpro.app.model.ResultadoSaberPro;
import com.saberpro.app.model.Beneficio;
import com.saberpro.app.repository.ResultadoSaberProRepository;
import com.saberpro.app.repository.BeneficioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ResultadoSaberProService {

    @Autowired
    private ResultadoSaberProRepository resultadoRepository;

    @Autowired
    private BeneficioRepository beneficioRepository;

    public List<ResultadoSaberPro> obtenerTodos() {
        return resultadoRepository.findAll();
    }

    public Optional<ResultadoSaberPro> obtenerPorId(Long id) {
        return resultadoRepository.findById(id);
    }

    public Optional<ResultadoSaberPro> obtenerPorEstudianteId(Long estudianteId) {
        return resultadoRepository.findByEstudianteId(estudianteId);
    }

    public Optional<ResultadoSaberPro> obtenerPorIdentificacion(String identificacion) {
        return resultadoRepository.findByEstudianteIdentificacion(identificacion);
    }

    public ResultadoSaberPro guardar(ResultadoSaberPro resultado) {
        // Asignar beneficio automáticamente según el puntaje
        asignarBeneficio(resultado);
        return resultadoRepository.save(resultado);
    }

    public ResultadoSaberPro actualizar(ResultadoSaberPro resultado) {
        // Asignar beneficio automáticamente según el puntaje
        asignarBeneficio(resultado);
        return resultadoRepository.save(resultado);
    }

    public void eliminar(Long id) {
        resultadoRepository.deleteById(id);
    }

    // Asignar beneficio según el puntaje (Acuerdo UTS)
    private void asignarBeneficio(ResultadoSaberPro resultado) {
        Integer puntaje = resultado.getPuntajeGlobal();
        Optional<Beneficio> beneficio = beneficioRepository.findByPuntaje(puntaje);
        beneficio.ifPresent(resultado::setBeneficio);
    }

    public List<ResultadoSaberPro> obtenerPorRangoPuntaje(Integer min, Integer max) {
        return resultadoRepository.findByPuntajeGlobalBetween(min, max);
    }

    public List<ResultadoSaberPro> obtenerSobresalientes() {
        return resultadoRepository.findByPuntajeGlobalGreaterThanEqual(241);
    }

    public Double calcularPromedioGeneral() {
        return resultadoRepository.calcularPromedioGeneral();
    }

    public Long contarSobresalientes() {
        return resultadoRepository.contarSobresalientes();
    }

    //Informes para el coordinador
    public List<ResultadoSaberPro> obtenerInformeAlumnos() {
        return obtenerTodos();
    }

    public List<ResultadoSaberPro> obtenerInformeDetallado() {
        return obtenerTodos();
    }

    public List<ResultadoSaberPro> obtenerInformeBeneficios() {
        return obtenerSobresalientes();
    }
}
