
package hn.uth.poo.e1.main.objetos;


public class Modelo {
    private int Codigo;
    private String nombre;
    private Marca Marca;

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

    public Marca getMarca() {
        return Marca;
    }

    public void setMarca(Marca Marca) {
        this.Marca = Marca;
    }

    public Modelo(int Codigo, String nombre, Marca Marca) {
        this.Codigo = Codigo;
        this.nombre = nombre;
        this.Marca = Marca;
    }

    public Modelo() {
    }
    
    
    
    
    
}
