package nunes.nycolas.t1.projeto1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class serviceApp {

    public static void main(String[] args) {
        SpringApplication.run(serviceApp.class, args);

        System.out.println("Barbearia aberta!");
    }

}