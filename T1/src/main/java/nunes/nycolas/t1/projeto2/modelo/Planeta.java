package nunes.nycolas.t1.projeto2.modelo;

public class Planeta {

    private String terra;

    public Planeta(){
    }

        public Planeta(String terra) {
            this.terra = terra;
        }
        public String getTerra() {
            return terra;
        }
        public void setTerra(String terra) {this.terra = terra; }

        @Override
        public String toString() {
            return "Planetas{" +
                    "Meu Planeta='" + terra + '\'' +
                    '}';
        }
}