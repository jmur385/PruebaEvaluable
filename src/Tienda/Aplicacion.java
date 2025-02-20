package Tienda;

import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {

        Tienda tienda = new Tienda();

        RopaDeportiva p1 = new RopaDeportiva("6414165",
                "Leggins",9.99,5,"M","Algodón");
        RopaDeportiva p2 = new RopaDeportiva("6418165",
                "Camiseta",3.99,1,"XL","Polyester");
        Equipamiento e1 = new Equipamiento("6414164","Playera",
                25.00,20,"Fútbol","Adidas");
        Equipamiento e2 = new Equipamiento("6714164","Pantalones cortos",
                15.00,20,"Fútbol","Adidas");

        tienda.anadirProducto(p1);
        tienda.anadirProducto(p2);
        tienda.anadirProducto(e2);
        tienda.anadirProducto(e1);

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("TIENDA DE DEPORTES");
            System.out.println("=====================");
            System.out.println("1. Mostrar inventario");
            System.out.println("2. Agregar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Actualizar producto");
            System.out.println("5. Realizar compra");
            System.out.println("6. Mostrar historial de compras");
            System.out.println("7. Salir");
            System.out.println("INTRODUCE OPCIÓN: (1-7)");
            opcion = Integer.parseInt(sc.nextLine());


            switch (opcion) {
                case 1:
                    tienda.mostrarInventario();
                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    try {
                        throw new StockInsuficienteException("Stock insuficiente para ese producto");
                    }
                    catch (StockInsuficienteException ex) {
                        System.out.println("ERROR!");
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 6:
                    tienda.mostrarHistorialCompras();
                    break;
                case 7:
                    System.out.println("Adiós, ¡gracias por comprar con nosotros!");
                    break;
                default:
                    System.out.println("ERROR! Opción incorrecta.");
            }

        } while (opcion != 7);


    }
}
