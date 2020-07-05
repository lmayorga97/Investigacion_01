
package hn.uth.poo.e1.main.objetos;


public class Producto {
    private int Codigo;
    private String Nombre;
    private double Precio;
    private Proveedor Proveedor;

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public Proveedor getProveedor() {
        return Proveedor;
    }

    public void setProveedor(Proveedor Proveedor) {
        this.Proveedor = Proveedor;
    }

    public Producto(int Codigo, String Nombre, double Precio, Proveedor Proveedor) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Proveedor = Proveedor;
    }
    
    

    public Producto() {
    }
}
