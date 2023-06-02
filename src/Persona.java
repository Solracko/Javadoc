/**
 * Clase persona, titular de la cuenta
 */
public class Persona {
    private String DNI;
    private String nombre;
    private String apellido;
    private String telefono;
    private String mail;

    /**
     * Constructor de la clase Persona
     * @param DNI DNI de la persona
     * @param nombre Nombre de la persona
     * @param apellido Apellidos de la persona
     * @param telefono Teléfono de la persona
     * @param mail Correo electrónico de la persona
     */
    public Persona(String DNI, String nombre, String apellido, String telefono, String mail) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
    }

    /**
     * Método que devuelve el nombre completo de la persona
     * @return nombre + apellido
     */
    public String nombreCompleto() {
        return nombre + " " + apellido;
    }
}
