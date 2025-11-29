package com.saberpro.app.service;

import com.saberpro.app.model.Beneficio;
import com.saberpro.app.repository.BeneficioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BeneficioService {

    @Autowired
    private BeneficioRepository beneficioRepository;

    public List<Beneficio> obtenerTodos() {
        return beneficioRepository.findAll();
    }

    public Optional<Beneficio> obtenerPorId(Long id) {
        return beneficioRepository.findById(id);
    }

    public Optional<Beneficio> obtenerPorPuntaje(Integer puntaje) {
        return beneficioRepository.findByPuntaje(puntaje);
    }

    public Optional<Beneficio> obtenerPorCategoria(String categoria) {
        return beneficioRepository.findByCategoria(categoria);
    }

    public Beneficio guardar(Beneficio beneficio) {
        return beneficioRepository.save(beneficio);
    }

    public Beneficio actualizar(Beneficio beneficio) {
        return beneficioRepository.save(beneficio);
    }

    public void eliminar(Long id) {
        beneficioRepository.deleteById(id);
    }

    // Inicializar beneficios según el Acuerdo UTS
    public void inicializarBeneficios() {
        if (beneficioRepository.count() == 0) {
            // Beneficio 1: Puntaje entre 180 y 210
            Beneficio beneficio1 = new Beneficio();
            beneficio1.setNombreBeneficio("Exoneración con nota 4.5");
            beneficio1.setDescripcion("Se exonera de la entrega del informe final de trabajo de grado, o de realizar Seminario de grado IV, con nota de cuatro punto cinco (4.5).");
            beneficio1.setPuntajeMinimo(180);
            beneficio1.setPuntajeMaximo(210);
            beneficio1.setNotaSeminario("4.5");
            beneficio1.setExoneracionTrabajoGrado(true);
            beneficio1.setExoneracionSeminario(true);
            beneficio1.setPorcentajeBecaDerechos(0);
            beneficio1.setCategoria("BÁSICO");
            beneficioRepository.save(beneficio1);

            // Beneficio 2: Puntaje entre 211 y 240
            Beneficio beneficio2 = new Beneficio();
            beneficio2.setNombreBeneficio("Exoneración con nota 4.7 + Beca 50%");
            beneficio2.setDescripcion("Se exonera de la entrega del informe final de trabajo de grado, o de realizar Seminario de grado IV, con nota de cuatro punto siete (4.7). Además, se beca con un 50% el valor de derechos de grado.");
            beneficio2.setPuntajeMinimo(211);
            beneficio2.setPuntajeMaximo(240);
            beneficio2.setNotaSeminario("4.7");
            beneficio2.setExoneracionTrabajoGrado(true);
            beneficio2.setExoneracionSeminario(true);
            beneficio2.setPorcentajeBecaDerechos(50);
            beneficio2.setCategoria("INTERMEDIO");
            beneficioRepository.save(beneficio2);

            // Beneficio 3: Puntaje superior a 241
            Beneficio beneficio3 = new Beneficio();
            beneficio3.setNombreBeneficio("Exoneración con nota 5.0 + Beca 100%");
            beneficio3.setDescripcion("Se exonera de la entrega del informe final de trabajo de grado, o de realizar Seminario de grado IV, con nota de cinco punto cero (5.0). Además, se beca con un 100% el valor de derechos de grado.");
            beneficio3.setPuntajeMinimo(241);
            beneficio3.setPuntajeMaximo(300);
            beneficio3.setNotaSeminario("5.0");
            beneficio3.setExoneracionTrabajoGrado(true);
            beneficio3.setExoneracionSeminario(true);
            beneficio3.setPorcentajeBecaDerechos(100);
            beneficio3.setCategoria("SOBRESALIENTE");
            beneficioRepository.save(beneficio3);
        }
    }
}
