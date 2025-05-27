package com.ejemplo.milog;

import org.springframework.web.bind.annotation.*;

@RestController
public class MiLogController {

    @PostMapping("/log")
    public String recibirLog(@RequestBody String mensaje) {
        System.out.println("Log recibido por HTTP: " + mensaje);
        return "Log recibido";
    }
}
