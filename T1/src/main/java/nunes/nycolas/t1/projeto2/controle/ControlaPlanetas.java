package nunes.nycolas.t1.projeto2.controle;

import nunes.nycolas.t1.projeto2.modelo.Planeta;
import nunes.nycolas.t1.projeto2.modelo.Planetas;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ControlaPlanetas {

    @GetMapping("/")
    public String index(){
        return "Bem vindo ao Planetário do Nyco";
    }

    @GetMapping("/terra")
    public Planeta getTerra(){

        Planeta terra = new Planeta();

        terra.setTerra("Terra");

        return terra;
    }

    @GetMapping("/sistemasolar")
    public ArrayList<Planetas> getPlanetasOrdem(){

        Planetas mercurio = new Planetas();
        mercurio.setLocal(1);
        mercurio.setPlanetas("Mercúrio");


        Planetas venus = new Planetas();
        venus.setPlanetas("Vênus");
        venus.setLocal(2);

        Planetas terra = new Planetas();
        terra.setPlanetas("Terra");
        terra.setLocal(3);

        ArrayList<Planetas> sistema = new ArrayList<>();
        sistema.add(mercurio);
        sistema.add(venus);
        sistema.add(terra);

        return sistema;

    }
}
