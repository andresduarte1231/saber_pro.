package com.saberpro.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Sistema de Gestión de Resultados Saber Pro - UTS
 * 
 * Sistema completo de gestión de resultados ICFES Saber Pro que implementa
 * el Acuerdo No. 01-009 (22 de abril de 2024) del Consejo Directivo UTS
 * para beneficios según puntajes sobresalientes.
 * 
 * Características:
 * - Dashboard de Administrador (Gestión de usuarios)
 * - Dashboard de Coordinador (Informes y estadísticas)
 * - Dashboard de Estudiante (Consulta de resultados y beneficios)
 * - Asignación automática de beneficios según puntaje
 * - Base de datos MySQL integrada
 * - Diseño responsive y profesional
 * 
 * @author Sistema Académico UTS
 * @version 1.0
 */
@SpringBootApplication
public class SaberProApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaberProApplication.class, args);
		System.out.println("\n" + 
			"═══════════════════════════════════════════════════════════════\n" +
			"   🎓 SISTEMA SABER PRO UTS - Iniciado exitosamente 🎓\n" +
			"═══════════════════════════════════════════════════════════════\n" +
			"   📍 URL: http://localhost:8080\n" +
			"   👨‍💼 Admin:       admin / admin123\n" +
			"   👔 Coordinador:  coordinador / coord123\n" +
			"   🎓 Estudiante:   (crear desde admin o cargar datos_prueba.sql)\n" +
			"═══════════════════════════════════════════════════════════════\n");
	}

}
