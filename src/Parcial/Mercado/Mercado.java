package Parcial.Mercado;

import java.util.ArrayList;

public class Mercado {
    public static final byte CAPACIDAD = 11;
    private String supermercado;
    private ArrayList<Producto> productos;

    public Mercado(String supermercado) {
        this.supermercado = supermercado;
        this.productos = new ArrayList<>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public String getSupermercado() {
        return supermercado;
    }

    public boolean agregar(Producto producto){
        boolean b=false;
        for (int i=0; i<productos.size(); i++) {
            if (producto.getCantidad() < CAPACIDAD && producto != productos.get(i)) {
                productos.add(producto);
                b=true;
            }
            else{
                b=false;
            }
        }
        return b;
    }

    public boolean retirar(String nombre){
        boolean b=false;
        int productoDespuesDeRetirar=0;
        for (int i=0; i<productos.size(); i++) {
            if (productos.get(i).getNombre() == nombre) {
                productos.remove(productos.get(i));
                b=true;
            }
            else{
                b=false;
            }
        }
        return b;
    }

    public Producto buscarN(String nombre){
        Producto producto = null;
        for (int i=0; i<productos.size(); i++) {
            if (productos.get(i).getNombre() == nombre) {
                producto = productos.get(i);
            }
        }
        return producto;
    }

    public Producto buscar(int codigo){
        Producto producto = null;
        for (int i=0; i<productos.size(); i++) {
            if (productos.get(i).getCodigo() == codigo) {
                producto = productos.get(i);
            }
        }
        return producto;
    }

    public ArrayList buscarPorTipo (String tipo) {
        ArrayList listaProductosEncontrados = new ArrayList();
        for (int i=0; i<productos.size(); i++) {
            if (productos.get(i).getTipo() == tipo) {
                listaProductosEncontrados.add(productos.get(i));
            }
        }
        return listaProductosEncontrados;
    }

    public int calcularTotal() {
        int total=0;
        for (int i=0; i<productos.size(); i++) {
            total +=productos.get(i).getPrecio()*productos.get(i).getCantidad();
        }
        return total;
    }
}
