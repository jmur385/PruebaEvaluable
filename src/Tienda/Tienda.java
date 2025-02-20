package Tienda;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private List<Producto> inventario;
    private List<Compra> historialCompras;

    public Tienda() {
        this.historialCompras = new ArrayList<Compra>();
        this.inventario = new ArrayList<Producto>();
    }

    public void anadirProducto(Producto p) {
        this.inventario.add(p);
    }

    public void eliminarProducto(String codigo){
        Producto prod = null;
        for (Producto producto : this.inventario) {
            if (producto.getCodigo().equals(codigo)) {
            prod = producto;

            }
        }

        this.inventario.remove(prod);

    }

    public void actualizarProducto(String codigo, double nuevoPrecio, int nuevoStock) {


    }

    public void realizarCompra(String codigo, int cantidad) {

    }

    public void mostrarInventario() {
        for(Producto inventario : this.inventario) {
            System.out.println(inventario);
        }    }

    public void mostrarHistorialCompras() {
        for(Compra historialCompras : this.historialCompras) {
            System.out.println(historialCompras);
        }
    }

}
