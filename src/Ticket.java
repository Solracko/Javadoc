/**
 * Clase Ticket
 */
public class Ticket {
    private String nombreApellido;
    private double montoTotal;
    private double montoPorCuota;

    /**
     * Constructor de la clase Cuenta
     * @param nombreApellido Nombre completo de la persona
     * @param montoTotal El monto total abonado
     * @param montoPorCuota El monto que se paga por cuota
     */
    public Ticket(String nombreApellido, double montoTotal, double montoPorCuota) {
        this.nombreApellido = nombreApellido;
        this.montoTotal = montoTotal;
        this.montoPorCuota = montoPorCuota;
    }

    /**
     * Método toString
     * @return En una string devuelve el nombre completo, la cantidad total a pagar, y el monto por cuota
     */
    @Override
    public String toString() {
        return "Ticket{" + "nombreApellido=" + nombreApellido + ", montoTotal=" + montoTotal + ", montoPorCuota=" + montoPorCuota + '}';
    }
}
