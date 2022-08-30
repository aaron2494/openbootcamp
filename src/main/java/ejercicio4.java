import java.lang.ref.Cleaner;

public class ejercicio4 {

    public static void main(String[]args) {

        cliente Cliente = new cliente();
        Cliente.setNombre("aaron");
        Cliente.setEdad("27");
        Cliente.setTelefono("3234234234");
        Cliente.setCredito("1234231");
        System.out.println(Cliente.getNombre());
        System.out.println((Cliente.getEdad()));
        System.out.println(Cliente.getTelefono());
        System.out.println(Cliente.getCredito());

        trabajador Trabajador=new trabajador();
        Trabajador.setNombre("jorge");
        Trabajador.setEdad("24");
        Trabajador.setTelefono("3423452");
        Trabajador.setSalario("2000");
        System.out.println(Trabajador.getNombre());
        System.out.println(Trabajador.getEdad());
        System.out.println(Trabajador.getTelefono());
        System.out.println(Trabajador.getSalario());
    }
    }
    class Persona {
        private String edad;
        private  String nombre;
        private String telefono;

        public String getEdad() {
            return edad;
        }
        public void setEdad(String edad) {
            this.edad = edad;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getTelefono() {
            return telefono;
        }
        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
    }
    class cliente extends Persona{
        private String credito;

        public String getCredito() {
            return credito;
        }
        public void setCredito(String credito) {
            this.credito = credito;
        }
    }
    class trabajador extends Persona{
        private String salario;

        public String getSalario() {
            return salario;
        }
        public void setSalario(String salario) {
            this.salario = salario;
        }
    }



