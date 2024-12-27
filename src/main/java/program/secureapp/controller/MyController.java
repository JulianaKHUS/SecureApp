package program.secureapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "This is a public endpoint. Accessible without authentication.";
    }

    @GetMapping("/private")
    public String privateEndpoint() {
        return "This is a private endpoint. Accessible only with authentication.";
    }
}
