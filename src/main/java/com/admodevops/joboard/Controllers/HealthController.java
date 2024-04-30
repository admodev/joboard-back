package com.admodevops.joboard.Controllers;

import com.admodevops.joboard.Health.HealthCheck;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/health")
public class HealthController {
    public HealthCheck healthCheck = new HealthCheck();

    @GetMapping("/check")
    public String checkHealth() {
        return healthCheck.checkHealth();
    }
}
