import co.alura.Practica.SistemaCredito.Producto;
import co.alura.Practica.SistemaCredito.Tarjeta;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        //Argumentos
        var name = "";
        var saldo = 0.0;
        var numberAccount = "";
        var realizarCompra = 0;
        var nameProduct = "";
        var precioProduct = 0.0;
        var diferencia = 0.0;

        List<Producto> listaDeCompras = new ArrayList<>();

        var input = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.println("Información de Usuario");
        System.out.println("------------------------------");

        System.out.print("nombre de Usuario : ");
        name = input.nextLine();
        System.out.print("Limite de Tarjeta : ");
        saldo = input.nextDouble();
        input.nextLine();
        System.out.print("Numero de tarjeta : ");
        numberAccount = input.nextLine();

        var cuentaPrincipal = new Tarjeta(name, saldo, numberAccount);

        System.out.println(cuentaPrincipal.getNameUser());

        System.out.println("""
                ¿Realizará compras con su tarjeta en este momento?
                1. Si 
                2. No """);
        realizarCompra = input.nextInt();

        while (realizarCompra != 2 && cuentaPrincipal.getSaldo() > 0){
            input.nextLine();
            Mensaje("Name Product : ");
            nameProduct = input.nextLine();
            Mensaje("Precio : ");
            precioProduct = input.nextDouble();

            cuentaPrincipal.setSaldo(cuentaPrincipal.getSaldo()-precioProduct);
            var productoNuevo = new Producto(nameProduct , precioProduct);
            listaDeCompras.add(productoNuevo);

            System.out.println("""
                ¿Quiere Seguir Comprando?
                1. Si 
                2. No """);
            realizarCompra = input.nextInt();

            if (precioProduct > cuentaPrincipal.getSaldo())
            {
                System.out.println("Saldo insuficiente, tu saldo es de "+ cuentaPrincipal.getSaldo());
                continue;
            }  else if (precioProduct < cuentaPrincipal.getSaldo()) {

            }
        }


        listaDeCompras.forEach(System.out::println);

        Collections.sort(listaDeCompras);

        System.out.println(listaDeCompras);

        System.out.println("----------------------------------");

        System.out.println("Lista de Compras");

        for (int i = 0; i < listaDeCompras.size(); i++) {
            System.out.println(" "+listaDeCompras.get(i).getNombreProducto() + " $"+listaDeCompras.get(i).getPrecio());
        }

    }

    public static void Mensaje(String mensaje){
        System.out.print(mensaje);
    }
}
