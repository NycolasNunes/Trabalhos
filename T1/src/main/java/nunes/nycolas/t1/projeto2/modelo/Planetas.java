package nunes.nycolas.t1.projeto2.modelo;


public class Planetas {

    private String planeta;
    private int local;

    public Planetas(){

    }

    public Planetas(String planeta) { this.planeta = planeta; }
    public String getPlanetas() { return planeta; }
    public void setPlanetas(String planeta) {this.planeta = planeta; }

    public Planetas(int local) { this.local = local; }
    public int getLocal() {
        return local;
    }
    public void setLocal(int local) { this.local = local; }


    @Override
    public String toString() {
        return "Planetas{" +
                "Planeta='" + planeta + '\'' + ',' +
                "Posição='" + local + '\'' +
                '}';
    }
}