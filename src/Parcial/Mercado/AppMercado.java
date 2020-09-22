package Parcial.Mercado;

import Parcial.Mercado.Producto;
import Parcial.Mercado.Mercado;
import Parcial.Mercado.TipoProducto;

import java.util.ArrayList;
import java.util.List;

public class AppMercado {
    public static void main(String[] args) {
        Producto arroz= new Producto((int) 101, "Arroz", (int) 10,(int) 20000,"Grano");
        Producto tomate= new Producto((int) 102,"Tomate", (int) 11,(int) 30000,"Verdura");
        Producto costilla= new Producto((int) 103, "Costilla", (int) 1,(int) 10000,"Carne");
        Producto leche= new Producto((int) 104, "Leche", (int) 9,(int) 2000,"Lacteo");
        Producto manzana= new Producto((int) 105, "Manzana", (int) 6,(int) 1500,"Fruta");
        Producto aguacate= new Producto((int) 106, "Aguacate", (int) 11,(int) 3000,"Fruta");
        Producto pastas= new Producto((int) 107, "Pastas", (int) 10,(int) 2500,"Pasta");
        Producto lentejas= new Producto((int) 108, "Lentajas", (int) 10,(int) 2500,"Grano");

        Mercado mercosto = new Mercado("Mercosto");
        mercosto.getProductos().add(arroz);
        mercosto.getProductos().add(tomate);
        mercosto.getProductos().add(costilla);
        mercosto.getProductos().add(leche);
        mercosto.getProductos().add(manzana);
        mercosto.getProductos().add(aguacate);
        mercosto.getProductos().add(pastas);

        System.out.println("Los productos que hay en el supermercado " + mercosto.getSupermercado() + " son: " + mercosto.getProductos());

        System.out.println("Se agrego correctamente el producto " + mercosto.agregar(lentejas));

        System.out.println("Se retiro correctamente el producto " + mercosto.retirar(lentejas.getNombre()));

        Producto buscadoNombre = mercosto.buscarN("Arroz");
        System.out.println("Se encontro el producto: " + buscadoNombre.getCodigo() + " " + buscadoNombre.getNombre());

        Producto buscarCodigo = mercosto.buscar(101);
        System.out.println("Se encontro el producto: " + buscarCodigo.getCodigo() + " " + buscarCodigo.getNombre());

        System.out.println(mercosto.buscarPorTipo("Pasta"));
        System.out.println("El valor del mercado es: " + mercosto.calcularTotal());

    }
}
