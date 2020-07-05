
package hn.uth.poo.e1.main;

import hn.uth.poo.e1.main.objetos.Cliente;
import hn.uth.poo.e1.main.objetos.Detalle;
import hn.uth.poo.e1.main.objetos.Factura;
import hn.uth.poo.e1.main.objetos.Producto;
import java.util.ArrayList;
import java.util.Scanner;


public class main {

    
    public static void main(String[] args) {
        try {
            int ndetalles;
            Scanner cap = new Scanner(System.in,"ISO-8859-1").useDelimiter("\\n");
            Cliente cliente1 = new Cliente();
            Factura factura1 = new Factura();
            Producto pro1 = new Producto();
            ArrayList<Detalle> detalle = new ArrayList<Detalle>();
            System.out.println("Ingrese el numero de factura:");
            factura1.setCodigo(cap.nextInt());
            System.out.println("Ingrese nombre del cliente: ");
            cliente1.setNombre(cap.nextLine());
            System.out.println("Ingrese ID del cliente: ");
            cliente1.setCodigo(cap.nextInt());
            System.out.println("¿Cuantos productos son?");
            ndetalles = cap.nextInt();
            for (int i = 0; i < ndetalles; i++) {
                Detalle detalles = new Detalle();
                Producto producto1 = new Producto();
                System.out.println("Ingrese el codigo del prodcuto: ");
                producto1.setCodigo(cap.nextInt());
                System.out.println("Ingrese el nombre del prodcuto: ");
                producto1.setNombre(cap.next());
                System.out.println("Ingrese el precio: ");
                producto1.setPrecio(cap.nextDouble());
                detalles.setProducto(producto1);
                System.out.println("Ingrese la cantidad a llevar: ");
                detalles.setCantidad(cap.nextInt());
                detalle.add(detalles);
                
            }
            factura1.setDetalle(detalle);
            
            System.out.println("La factura " + factura1.getCodigo() + "Fue comprada por " + cliente1.getNombre() );
            for (Detalle item : detalle) {
                
                System.out.println("El Prodcuto" + item.getProducto().getNombre() + "a un precio de " + item.getProducto().getPrecio() + "Llevando la cantidad de " + item.getCantidad()) ;
                
            }
            
            
            
            
        } catch (Exception e) {
        }
    
    }
    
}
