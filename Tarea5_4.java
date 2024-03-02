public class Tarea5_4 {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Fecha fechaNacimiento;
    private String curp;
    private String rfc;
    private double estatura;
    private double peso;

    public Tarea5_4(String nombre, String apellidoPaterno, String apellidoMaterno, Fecha fechaNacimiento, String curp, String rfc, double estatura, double peso) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.curp = curp;
        this.rfc = rfc;
        this.estatura = estatura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String toString() {
        return "**Persona:**\n" +
                "Nombre completo: " + nombre + " " + apellidoPaterno + " " + apellidoMaterno + "\n" +
                "Fecha de nacimiento: " + fechaNacimiento + "\n" +
                "CURP: " + curp + "\n" +
                "RFC: " + rfc + "\n" +
                "Estatura: " + estatura + " m\n" +
                "Peso: " + peso + " kg";
    }
}
