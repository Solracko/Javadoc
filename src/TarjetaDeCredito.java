/**
 * Clase tarjeta de crédito
 */
public class TarjetaDeCredito {
    private String entidadBancaria;
    private String nroTarjeta;
    private double saldo;
    private EntidadFinanciera entidadFinanciera;
    private Persona titular;

    /**
     * Constructor de la clase TarjetaDeCredito
     * @param entidadBancaria La entidad bancaria de la cuenta
     * @param nroTarjeta El número de la tarjeta
     * @param saldo El saldo de la cuenta
     * @param titular Titular de la cuenta
     * @param entidadFinanciera Entidad financiera de la cuenta
     */
    public TarjetaDeCredito(String entidadBancaria, String nroTarjeta, double saldo, Persona titular, EntidadFinanciera entidadFinanciera) {
        this.entidadBancaria = entidadBancaria;
        this.nroTarjeta = nroTarjeta;
        this.saldo = saldo;
        this.titular = titular;
        this.entidadFinanciera = entidadFinanciera;
    }

    /**
     * Método que comprueba si hay saldo disponible
     * @param monto Monto a comprobar
     * @return Si hay saldo disponible
     */
    public boolean tieneSaldoDisponible(double monto) {
        return saldo >= monto;
    }

    /**
     * Método que retira dinero a la cuenta
     * @param monto Monto que se resta al saldo
     */
    public void descontar(double monto) {
        saldo = saldo - monto;
        // saldo -= monto;
    }

    /**
     * Método que nos da el nombre del titular
     * @return El nombre completo del titular
     */
    public String nombreCompletoDeTitular() {
        return titular.nombreCompleto();
    }

    /**
     * Método toString
     * @return Nos devuelve como string la entidad bancaria, el numero de la tarjeta, el saldo, entidad financiera y el nombre titular
     */
    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidadBancaria=" + entidadBancaria + ", nroTarjeta=" + nroTarjeta + ", saldo=" + saldo + ", entidadFinanciera=" + entidadFinanciera + ", titular=" + titular + '}';
    }
}
