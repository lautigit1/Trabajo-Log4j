package com.ejemplo.milog;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpLogSender {

    public static void enviar(String mensaje) {
        try {
            URL url = new URL("http://localhost:8080/log");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setDoOutput(true);
            con.setRequestProperty("Content-Type", "text/plain");

            try (OutputStream os = con.getOutputStream()) {
                os.write(mensaje.getBytes());
                os.flush();
            }

            int status = con.getResponseCode();
            System.out.println("Respuesta HTTP: " + status);
            con.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
