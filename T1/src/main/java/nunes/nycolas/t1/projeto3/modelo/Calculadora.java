package nunes.nycolas.t1.projeto3.modelo;

public class Calculadora {
    private double OperadorEsquerda;
    private double OperadorDireita;
    private String operador;

    public Calculadora(double operadorEsquerda, double operadorDireita, String operador) {
        this.OperadorEsquerda = operadorEsquerda;
        this.OperadorDireita = operadorDireita;
        this.operador = operador;
    }


    public double getOperadorEsquerda() {
        return OperadorEsquerda;
    }

    public void setOperadorEsquerda(double operadorEsquerda) {
        this.OperadorEsquerda = operadorEsquerda;
    }

    public double getOperadorDireita() {
        return OperadorDireita;
    }

    public void setOperadorDireita(double operadorDireita) {
        this.OperadorDireita = operadorDireita;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public double resultado() {
        double resultado = 0;
        switch(this.operador) {
            case "+":
                resultado = this.OperadorEsquerda + this.OperadorDireita;
                break;
            case "-":
                resultado = this.OperadorEsquerda - this.OperadorDireita;
                break;
            case "*":
                resultado = this.OperadorEsquerda * this.OperadorDireita;
                break;
            case "/":
                resultado = this.OperadorEsquerda / this.OperadorDireita;
                break;
            case "^":
                resultado = Math.pow(this.OperadorEsquerda,this.OperadorDireita);
                break;
            default:
                resultado = 0;
        }

        return resultado;
    }
}