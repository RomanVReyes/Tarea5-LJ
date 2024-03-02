public class Monedero {
    private int centavo1;
    private int centavo5;
    private int centavo10;
    private int centavo25;

    public Monedero(int centavo1, int centavo5, int centavo10, int centavo25) {
        this.centavo1 = centavo1;
        this.centavo5 = centavo5;
        this.centavo10 = centavo10;
        this.centavo25 = centavo25;
    }

    public void depositar(int uno, int cinco, int diez, int veinticinco) {
        this.centavo1 += uno;
        this.centavo5 += cinco;
        this.centavo10 += diez;
        this.centavo25 += veinticinco;
    }

    public void retirar(int uno, int cinco, int diez, int veinticinco) {
        this.centavo1 -= uno;
        this.centavo5 -= cinco;
        this.centavo10 -= diez;
        this.centavo25 -= veinticinco;
    }

    public double total() {
        return (centavo1 + 5 * centavo5 + 10 * centavo10 + 25 * centavo25) / 100.0;
    }

    public int getCentavo1() {
        return centavo1;
    }

    public void setCentavo1(int centavo1) {
        this.centavo1 = centavo1;
    }

    public int getCentavo5() {
        return centavo5;
    }

    public void setCentavo5(int centavo5) {
        this.centavo5 = centavo5;
    }

    public int getCentavo10() {
        return centavo10;
    }

    public void setCentavo10(int centavo10) {
        this.centavo10 = centavo10;
    }

    public int getCentavo25() {
        return centavo25;
    }

    public void setCentavo25(int centavo25) {
        this.centavo25 = centavo25;
    }

    public String toString() {
        return "Monedero [1c=" + centavo1 + ", 5c=" + centavo5 + ", 10c=" + centavo10 + ", 25c=" + centavo25 + "]";
    }
}
