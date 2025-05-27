package com.ejemplo.milog;

import java.io.File;

public class LogFileChecker {

    public static void verificarArchivos() {
        File logDir = new File("logs/");
        if (logDir.exists() && logDir.isDirectory()) {
            System.out.println("Archivos en logs/:");
            for (File file : logDir.listFiles()) {
                System.out.println("- " + file.getName());
            }
        } else {
            System.out.println("Directorio logs/ no existe.");
        }
    }
}
