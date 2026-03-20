package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/welcome/{name}")
    public String welcome(@PathVariable() String name) {
        return "Welcome " + name;
    }

    @GetMapping("/welcome")
    public String welcomeOther(@RequestParam() String name) {
        return "Welcome " + name;
    }
}
