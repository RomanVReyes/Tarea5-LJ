class MonederoDolares {
    private int centavo1;
    private int centavo5;
    private int centavo10;
    private int centavo25;

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

    public void depositar(int uno, int cinco, int diez, int veinticinco) {
        setCentavo1(getCentavo1() + uno);
        setCentavo5(getCentavo5() + cinco);
        setCentavo10(getCentavo10() + diez);
        setCentavo25(getCentavo25() + veinticinco);
    }

    public void retirar(int uno, int cinco, int diez, int veinticinco) {
        if (getCentavo1() >= uno && getCentavo5() >= cinco && getCentavo10() >= diez && getCentavo25() >= veinticinco) {
            setCentavo1(getCentavo1() - uno);
            setCentavo5(getCentavo5() - cinco);
            setCentavo10(getCentavo10() - diez);
            setCentavo25(getCentavo25() - veinticinco);
        } else {
            System.out.println("No hay suficientes monedas para retirar.");
        }
    }

    public double total() {
        double totalCentavos = getCentavo1() + getCentavo5() * 5 + getCentavo10() * 10 + getCentavo25() * 25;
        return totalCentavos / 100;
    }

    public String toString() {
        return "Monedero:" + "\n" +
                "centavo1: " + getCentavo1() + "\n" +
                "centavo5: " + getCentavo5() + "\n" +
                "centavo10: " + getCentavo10() + "\n" +
                "centavo25: " + getCentavo25();
    }
}

public class Tarea5_2 {
    public static void main(String[] args) {
        MonederoDolares monedero = new MonederoDolares();
        monedero.depositar(10, 5, 3, 2);
        System.out.println("Estado inicial del monedero:");
        System.out.println(monedero);
        monedero.retirar(2, 1, 0, 1);
        System.out.println("\nEstado del monedero después de retirar monedas:");
        System.out.println(monedero);
        System.out.println("\nTotal en el monedero: $" + monedero.total());
    }
}
