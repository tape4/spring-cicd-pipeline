package cicd.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HealthCheck {

    @ResponseBody
    @GetMapping("/health-check")
    public String health_check() {
        return "OK";
    }
}
