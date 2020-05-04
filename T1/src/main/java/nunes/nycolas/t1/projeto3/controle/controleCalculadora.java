package nunes.nycolas.t1.projeto3.controle;
import nunes.nycolas.t1.projeto3.modelo.Calculadora;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class controleCalculadora {

    @GetMapping("/calculadora")
    public String index(Model ControleCalculadora) {
        ControleCalculadora.addAttribute("operador", "+");
        ControleCalculadora.addAttribute("view", "views/calculadora");
        return "base-layout";
    }

    @PostMapping("/")
    public String index(
            @RequestParam String OperadorEsquerda,
            @RequestParam String operador,
            @RequestParam String OperadorDireita,
            Model model
    ) {
        double numeroEsquerda;
        double numeroDireita;

        try {
            numeroEsquerda = Double.parseDouble(OperadorEsquerda);
        }
        catch (NumberFormatException ex) {
            numeroEsquerda = 0;
        }

        try {
            numeroDireita = Double.parseDouble(OperadorDireita);
        }
        catch (NumberFormatException ex) {
            numeroDireita = 0;
        }

        Calculadora calculadora = new Calculadora(
                numeroEsquerda,
                numeroDireita,
                operador
        );

        double resultado = calculadora.resultado();
        model.addAttribute("OperadorEsquerda", numeroEsquerda);
        model.addAttribute("operador", operador);
        model.addAttribute("OperadorDireita", numeroDireita);
        model.addAttribute("resultado", resultado);

        model.addAttribute("view", "views/calculadora");
        return "base-layout";
    }
}