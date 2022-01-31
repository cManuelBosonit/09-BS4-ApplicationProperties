package com.example.ApplicationProperties;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationPropertiesScan
public class Controlador {


    @Value("${VAR1}")
    private String VAR1;

    @Value("var3 no tiene valor")
    private String VAR3;

    @Autowired
    My my;

    //GET
    // localhost:8080/valores
    @GetMapping("/valores")
    public String dameValores(){

        return "valor de var1 es: " + VAR1.toString() + " valor de my.var2 es: " + my.getVAR2().toString();
    }

    //GET
    // localhost:8080/var3
    @GetMapping("/var3")
    public String dameVar3(){

        return "valor de var3 es: " + VAR3;
    }

}
