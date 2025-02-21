package Tienda;

public class Equipamiento extends ProductoBase {

    private String deporte;
    private String marca;

    public Equipamiento(String nombre, Double precio,
                        Integer stock, String deporte, String marca) {
        super(nombre, precio, stock);
        this.deporte = deporte;
        this.marca = marca;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Equipamiento{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", deporte='" + deporte + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }

    @Override
    public String getInfo() {
        return "Equipamiento{" +
                "deporte='" + deporte + '\'' +
                ", marca='" + marca + '\'' +
                ", código='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
