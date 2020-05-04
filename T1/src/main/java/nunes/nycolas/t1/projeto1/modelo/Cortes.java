package nunes.nycolas.t1.projeto1.modelo;

public class Cortes {

    private String tipo;

    public Cortes() {
    }

    public Cortes(String tipo) {
        this.tipo = tipo;
    }

        public String getTipo() {
        return tipo;
    }

        public void setTipo(String tipo) {
        this.tipo = tipo;
    }

        @Override
        public String toString() {
        return "Cortes{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
    }