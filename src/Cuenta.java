public class Cuenta {

    int numCuenta;
    String tipoCuenta;

    public Cuenta(int numCuenta, String tipoCuenta) {
        this.numCuenta = numCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    public void consignarCuenta (int dinero){

    }

    public void transferirCuenta (int codigoTransferencia){

    }

    public void retirarDinero(int dinero){

    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
}
