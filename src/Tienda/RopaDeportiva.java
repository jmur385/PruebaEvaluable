package Tienda;

public class RopaDeportiva extends ProductoBase{

    private String talla;
    private String material;

    public RopaDeportiva(String nombre, Double precio,
                         Integer stock, String talla, String material) {
        super(nombre, precio, stock);
        this.talla = talla;
        this.material = material;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "RopaDeportiva{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", talla='" + talla + '\'' +
                ", material='" + material + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }

    @Override
    public String getInfo() {
        return "RopaDeportiva{" +
                "talla='" + talla + '\'' +
                ", material='" + material + '\'' +
                ", código='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
