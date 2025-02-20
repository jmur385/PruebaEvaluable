package Tienda;

public interface Producto {

    String getCodigo();

    String getNombre();

    Double getPrecio();

    Integer getStock();

    String getInfo();

    void setPrecio(Double precio);

    void setStock(Integer stock);

    void descontarStock(int cantidad);

}
