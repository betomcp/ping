package com.fiap.ping;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PingController {

    @Value("${mensagem}")
    private String mesage;

    @GetMapping("/ping")
    public String ping() {
        return "pong-" + mesage;
    }
}
