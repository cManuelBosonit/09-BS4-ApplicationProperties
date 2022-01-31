package com.example.ApplicationProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "my")
public class My {
    private String VAR2;

    public String getVAR2() {
        return VAR2;
    }

    public void setVAR2(String VAR2) {
        this.VAR2 = VAR2;
    }
}