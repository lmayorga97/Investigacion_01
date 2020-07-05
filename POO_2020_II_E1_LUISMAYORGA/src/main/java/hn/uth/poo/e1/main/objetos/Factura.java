/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.e1.main.objetos;

import java.util.ArrayList;

/**
 *
 * @author Pudin
 */
public class Factura {
    private Cliente Cliente;
    private int Codigo;
    private ArrayList<Detalle> Detalle;

    public Factura(Cliente Cliente, int Codigo, ArrayList<Detalle> Detalle) {
        this.Cliente = Cliente;
        this.Codigo = Codigo;
        this.Detalle = Detalle;
    }

    public Factura() {
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public ArrayList<Detalle> getDetalle() {
        return Detalle;
    }

    public void setDetalle(ArrayList<Detalle> Detalle) {
        this.Detalle = Detalle;
    }
      
    
    
}
