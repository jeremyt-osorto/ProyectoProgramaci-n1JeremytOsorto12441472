/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramacion1jeremytosorto12441472;
import java.util.Random;
import proyectoprogramacion1jeremytosorto12441472.Familias;
/**
 *
 * @author DELL
 */
public class Producto {
    static Familias fam=new Familias();
    private String nombre;
    private double precio;
    private int cantidad;
    private int codigo;
    private Familias fami;
    static Random ran=new Random(); //Random

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    private static int crearcodigo(){ //Metodo estático, Metodo que regresa un int;
        int c=ran.nextInt(0,999999);
        return c;
    }

    public Producto(String nombre, double precio, int cantidad, Familias fam) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.codigo= crearcodigo(); 
        this.fami= fam;
    }

    public Familias getFami() {
        return fami;
    }

    public void setFami(Familias fami) {
        this.fami = fami;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", codigo=" + codigo + ", fami=" + fami + '}';
    }
    
}
