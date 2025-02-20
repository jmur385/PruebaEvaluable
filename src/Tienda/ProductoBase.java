package Tienda;

import java.util.UUID;

public abstract class ProductoBase implements Producto {

    protected String codigo;
    protected String nombre;
    protected Double precio;
    protected Integer stock;

    public ProductoBase(String nombre, Double precio, Integer stock) {
        this.codigo = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void descontarStock(int cantidad) {
        this.stock=cantidad;
        --cantidad;
    }

    public abstract String getInfo();

}
