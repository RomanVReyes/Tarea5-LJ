class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void mostrarFecha() {
        String[] nombresMeses = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
                                 "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        System.out.println(dia + " de " + nombresMeses[mes - 1] + " de " + anio);
    }

    public String toString() {
        return dia + " de " + mes + " de " + anio;
    }
}

public class Tarea5_3 {
    public static void main(String[] args) {
        Fecha fecha = new Fecha();

        fecha.setDia(1);
        fecha.setMes(3);
        fecha.setAnio(2022);

        System.out.print("Fecha utilizando mostrarFecha(): ");
        fecha.mostrarFecha();

        System.out.println("Fecha utilizando toString(): " + fecha.toString());
    }
}
