package io.github.danillogoncalves;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class MyConfiguration {

  @Bean
  public CommandLineRunner executar() {
    return args -> {
      System.out.println("RODANDO A CONFIGURAÇÕES DE DESENVOLVIMENTO");
    };
  }
}
