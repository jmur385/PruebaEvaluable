package Tienda;

import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {

        Tienda tienda = new Tienda();

        RopaDeportiva p1 = new RopaDeportiva("Leggins",9.99,5,"M","Algodón");
        RopaDeportiva p2 = new RopaDeportiva("Camiseta",3.99,1,"XL","Polyester");
        Equipamiento e1 = new Equipamiento("Playera",
                25.00,20,"Fútbol","Adidas");
        Equipamiento e2 = new Equipamiento("Pantalones cortos",
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

                    System.out.println("¿Quieres añadir ropa (1) o equipamiento (2)?");

                    int tipo = Integer.parseInt(sc.nextLine());

                    switch (tipo) {
                        case 1:
                            System.out.print("Nombre: ");
                            String nom = sc.nextLine();
                            System.out.print("Precio: ");
                            double precio = Double.parseDouble(sc.nextLine());
                            System.out.print("Stock: ");
                            int stock = Integer.parseInt(sc.nextLine());
                            System.out.print("Talla: ");
                            String talla = sc.nextLine();
                            System.out.print("Material: ");
                            String mat = sc.nextLine();
                            RopaDeportiva rd = new RopaDeportiva(nom,precio,stock,talla,mat);
                            tienda.anadirProducto(rd);
                            break;
                        case 2:
                            System.out.print("Nombre: ");
                            String nomE = sc.nextLine();
                            System.out.print("Precio: ");
                            double precioE = Double.parseDouble(sc.nextLine());
                            System.out.print("Stock: ");
                            int stockE = Integer.parseInt(sc.nextLine());
                            System.out.print("Talla: ");
                            String dep = sc.nextLine();
                            System.out.print("Material: ");
                            String marca = sc.nextLine();
                            Equipamiento e = new Equipamiento(nomE,precioE,stockE,dep,marca);
                            tienda.anadirProducto(e);
                            break;
                        default:
                            System.out.println("ERROR! Opción No Válida");
                    }

                    break;
                case 3:
                    System.out.println("¿Cuál es el código?");
                    String cod = sc.nextLine();
                    tienda.eliminarProducto(cod);
                    break;
                case 4:
                    break;
                case 5:
                    try {
                        throw new StockInsuficienteException("Stock insuficiente de ese producto");
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
