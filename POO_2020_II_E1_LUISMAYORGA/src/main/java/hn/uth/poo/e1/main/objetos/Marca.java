
package hn.uth.poo.e1.main.objetos;


public class Marca {
    private int Codigo;
    private String nombre;
    

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Marca(int Codigo, String nombre) {
        this.Codigo = Codigo;
        this.nombre = nombre;
    }

    public Marca() {
    }
    
    
}
