class Persona {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String fechaNacimiento; 
    private String curp;
    private String rfc;
    private float estatura;
    private float peso;

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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
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

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String toString() {
        return "Nombre: " + nombre + '\n' +
                "Apellido Paterno: " + apellidoPaterno + '\n' +
                "Apellido Materno: " + apellidoMaterno + '\n' +
                "Fecha de Nacimiento: " + fechaNacimiento + '\n' +
                "Curp: " + curp + '\n' +
                "Rfc: " + rfc + '\n' +
                "Estatura: " + estatura + '\n' +
                "Peso: " + peso;
    }
}

public class Tarea5_4 {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        persona1.setApellidoPaterno("García");
        persona1.setApellidoMaterno("López");
        persona1.setFechaNacimiento("1990-05-15");
        persona1.setCurp("GALJ900515HMCNRL07");
        persona1.setRfc("GALJ900515XXXXX07");
        persona1.setEstatura(1.75f);
        persona1.setPeso(70f);

        Persona persona2 = new Persona();
        persona2.setNombre("María");
        persona2.setApellidoPaterno("Hernández");
        persona2.setApellidoMaterno("Pérez");
        persona2.setFechaNacimiento("1985-10-20");
        persona2.setCurp("HMP850102MCMRNS09");
        persona2.setRfc("HMP850102XXXXX09");
        persona2.setEstatura(1.60f);
        persona2.setPeso(65f);

        Persona persona3 = new Persona();
        persona3.setNombre("Carlos");
        persona3.setApellidoPaterno("Martínez");
        persona3.setApellidoMaterno("Gómez");
        persona3.setFechaNacimiento("1995-12-30");
        persona3.setCurp("CMG951230HMCRLS03");
        persona3.setRfc("CMG951230XXXXX03");
        persona3.setEstatura(1.80f);
        persona3.setPeso(80f);

        System.out.println("Datos de persona 1:");
        System.out.println(persona1.toString());
        System.out.println("\nDatos de persona 2:");
        System.out.println(persona2.toString());
        System.out.println("\nDatos de persona 3:");
        System.out.println(persona3.toString());
    }
}

