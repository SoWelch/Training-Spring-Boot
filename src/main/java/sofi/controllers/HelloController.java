package sofi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sofi.services.HelloWorldService;

@Controller
public class HelloController {
    private final HelloWorldService service;

    public HelloController(HelloWorldService service) {
        this.service = service;
    }

    // Setup the endpoint for returning the service message
    @RequestMapping("/hello")
    public @ResponseBody String message() {
        return service.hello();
    }
}
