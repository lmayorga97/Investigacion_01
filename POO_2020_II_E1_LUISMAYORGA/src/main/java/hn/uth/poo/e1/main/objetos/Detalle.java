
package hn.uth.poo.e1.main.objetos;

import java.util.ArrayList;


public class Detalle {
    private double Cantidad;
    private Producto Producto;

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Producto getProducto() {
        return Producto;
    }

    public void setProducto(Producto Producto) {
        this.Producto = Producto;
    }

    public Detalle(double Cantidad, Producto Producto) {
        this.Cantidad = Cantidad;
        this.Producto = Producto;
    }

    public Detalle() {
    }

    public void add(ArrayList<Detalle> detalle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
