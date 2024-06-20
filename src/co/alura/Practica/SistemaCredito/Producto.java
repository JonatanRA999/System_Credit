package co.alura.Practica.SistemaCredito;

public class Producto implements Comparable<Producto>{
    private String nombreProducto;
    private String descripcion;
    private double precio;

    public Producto(String nombreProducto, double precio)
    {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre Producto : "+ this.nombreProducto + " precio : "+ (int) this.precio;
    }


    @Override
    public int compareTo(Producto otro) {

        return Integer.valueOf((int) this.precio).compareTo(Integer.valueOf((int) otro.precio));
    }
}
