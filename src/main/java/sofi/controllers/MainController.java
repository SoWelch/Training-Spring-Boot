package sofi.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MainController {

    // Setting up an endpoint for root, that returns a simple string message
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
