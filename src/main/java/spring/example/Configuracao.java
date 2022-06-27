package spring.example;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuracao {
    @Bean(name = "aplicationName")
    public String aplicationName(){
        return "spring vendas";
    }
}
