/**
 * Clase Posnet
 */
public class Posnet {
    public static final double RECARGO_POR_CUOTA = 0.03;
    public static final int MIN_CANT_CUOTAS = 1;
    public static final int MAX_CANT_CUOTAS = 6;

    /**
     * Método que genera un ticket
     * @param tarjeta Objeto de tipo tarjeta
     * @param montoAAbonar Monto a abonar
     * @param cantCuotas Cantidad de cuotas
     * @return Objeto de tipo ticket
     */
    public Ticket efectuarPago(TarjetaDeCredito tarjeta, double montoAAbonar, int cantCuotas) {
        Ticket elTicket = null;

        if (datosValidos(tarjeta, montoAAbonar, cantCuotas)) {
            double montoFinal = montoAAbonar + montoAAbonar * recargoSegunCuotas(cantCuotas);
            if (tarjeta.tieneSaldoDisponible(montoFinal)) {
                tarjeta.descontar(montoFinal);
                String nomApe = tarjeta.nombreCompletoDeTitular();
                double montoPorCuota = montoFinal / cantCuotas;
                elTicket = new Ticket(nomApe, montoFinal, montoPorCuota);
            }
        }

        return elTicket;
    }

    /**
     * Método que valida si los datos son validos
     * @param tarjeta Objeto de tipo tarjeta
     * @param monto Monto a pagar
     * @param cant Cantidad de cuotas
     * @return Si los datos son validos o no
     */
    private boolean datosValidos(TarjetaDeCredito tarjeta, double monto, int cant) {
        boolean esTarjetaValida = tarjeta != null;
        boolean esMontoValido = monto > 0;
        boolean cantCuotasValidas = cant >= MIN_CANT_CUOTAS && cant <= MAX_CANT_CUOTAS;

        return esTarjetaValida && esMontoValido && cantCuotasValidas;
    }

    /**
     * Método recargo según cuotas, devuelve la cantidad a pagar
     * @param cantCuotas Cantidad de cuotas a pagar
     * @return La cantidad de cuotas -1 por el recargo por cuotas
     */
    private double recargoSegunCuotas(int cantCuotas) {
        return (cantCuotas - 1) * RECARGO_POR_CUOTA;
    }

}
