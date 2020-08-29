public class TarjetaDebito extends Tarjeta{

    int numTarjeta;

    public TarjetaDebito(int numCuenta, String tipoCuenta, int saldoCuenta, int numTarjeta, int numTarjeta1) {
        super(numCuenta, tipoCuenta, saldoCuenta, numTarjeta);
        this.numTarjeta = numTarjeta1;
    }

    public void consultarSaldo(){

    }

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }


}
