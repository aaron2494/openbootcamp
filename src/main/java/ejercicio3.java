public class ejercicio3 {

    public static  void main(String[]args){
        persona Persona=new persona();
        Persona.setNombre("aaron");
        Persona.setEdad("27");
        Persona.setTelefono("11233452");
        System.out.println(Persona.getNombre());
        System.out.println(Persona.getEdad());
        System.out.println(Persona.getTelefono());
    }
}

class persona{
    private String edad;
    private String nombre;
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