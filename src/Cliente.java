import java.util.ArrayList;

public class Cliente {

    String id;
    String nombre;
    ArrayList <Cuenta> producto = new ArrayList();

    public Cliente(String id, String nombre, ArrayList<Cuenta> producto) {
        this.id = id;
        this.nombre = nombre;
        this.producto = producto;
    }

    public void agregarCuenta(Cuenta cuenta){
        producto.add(cuenta);
    }

}
