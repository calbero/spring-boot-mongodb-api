package com.calbero;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <b>Proyect: gastosPiso</b><br>
 * File: Application.java<br>
 * Date: 11/02/2018
 * Comentarios:
 * <br>
 *
 * @author Carlos
 */

@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("deployed and running");
    }
}
