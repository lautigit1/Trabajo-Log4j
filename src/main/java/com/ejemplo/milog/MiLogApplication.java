package com.ejemplo.milog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MiLogApplication implements CommandLineRunner {

    private static final Logger logger = LogManager.getLogger("milog");

    public static void main(String[] args) {
        SpringApplication.run(MiLogApplication.class, args);
    }

    @Override
    public void run(String... args) {
        // Ejercicio B.1 - Inicio
        logger.info("La aplicación se ha iniciado.");

        // Ejercicio B.2 - Nivel personalizado (simulado con INFO)
        logger.info("Mensaje con nivel personalizado (miLogLevel simulado).");

        // Ejercicio B.3a - Consola
        logger.info("Mensaje enviado a consola.");

        // Ejercicio B.3b - Archivo
        logger.warn("Mensaje enviado a log.txt y archivo rotativo.");

        // Ejercicio B.3c - Simulación de envío por HTTP
        HttpLogSender.enviar("Este mensaje se envía por HTTP desde la aplicación.");

        // Ejercicio B.4 - Appender con HTMLLayout (ver consola)
        logger.info("Probando appender con HTMLLayout en consola.");

        // Ejercicio B.5 - Rolling file cada 2 minutos
        logger.info("Este mensaje debería verse en un archivo rotado cada 2 minutos.");

        // Ejercicio B.6 - CronTriggeringPolicy
        logger.info("Este mensaje va al archivo con rotación por cron.");

        // Ejercicio B.7 - PatternLayout en diferentes formatos
        PatternDemoLogger.mostrarFormatos();

        // Ejercicio B.8 - Interpretación de patrones
        logger.info("Ejercicio B.8a → %d [%-6p] %c{1} - %m%n");
        logger.info("Ejercicio B.8b → %sn %d{yyyy/MM/dd HH:mm:ss,SSS} %r [%-6p] [%t] %c{3} %C{3}.%M(%F:%L) - %m%n");

        // Ejercicio B.9 - ThreadContext
        ThreadContext.put("usuario", "juanperez");
        ThreadContext.put("operacion", "login");
        logger.info("Mensaje con contexto (ThreadContext): usuario y operación.");
        ThreadContext.clearAll();

        // Verificación opcional de archivos creados
        LogFileChecker.verificarArchivos();
    }
}
