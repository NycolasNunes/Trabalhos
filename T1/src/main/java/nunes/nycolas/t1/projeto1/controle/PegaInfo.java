package nunes.nycolas.t1.projeto1.controle;

import nunes.nycolas.t1.projeto1.modelo.Cortes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;


@RestController
public class PegaInfo {

    @GetMapping("/entrada")
    public String getCorte() {
        return "Escolha seu corte aqui";
    }

    @GetMapping("/corte")
    public Cortes getCortes(){

        Cortes corte = new Cortes();

        corte.setTipo("Maquina");

        return corte;
    }

    @GetMapping("/listacortes")
    public ArrayList<Cortes> getCortesLista(){

        Cortes corte1 = new Cortes();
        corte1.setTipo("Maquina");

        Cortes corte2 = new Cortes();
        corte2.setTipo("Navalha");

        Cortes corte3 = new Cortes();
        corte3.setTipo("Tesoura");

        Cortes corteCombo1 = new Cortes();
        corteCombo1.setTipo("Máqunia + Navalha");

        Cortes corteCombo2 = new Cortes();
        corteCombo2.setTipo("Tesoura + Navalha");

        Cortes completo = new Cortes();
        completo.setTipo("Estilo completo");

        ArrayList<Cortes> lista = new ArrayList<>();
        lista.add(corte1);
        lista.add(corte2);
        lista.add(corte3);
        lista.add(corteCombo1);
        lista.add(corteCombo2);
        lista.add(completo);

        return lista;

    }
}