package com.bodesere.designpatternsinspring;

import com.bodesere.designpatternsinspring.creational.prototype.ProtoFalse;
import com.bodesere.designpatternsinspring.creational.prototype.ProtoTrue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DesignPatternsInSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsInSpringApplication.class, args);
    }

    @Bean
    public ProtoFalse protoFalse() {
        return new ProtoFalse();
    }

    @Bean
    @Scope("prototype")
    public ProtoTrue protoTrue() {
        return new ProtoTrue();
    }
}
