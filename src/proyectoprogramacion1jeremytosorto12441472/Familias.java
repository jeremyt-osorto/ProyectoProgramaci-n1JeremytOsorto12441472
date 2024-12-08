/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogramacion1jeremytosorto12441472;

/**
 *
 * @author DELL
 */
public class Familias {
    private String name;
    private int cant_unid;

    public Familias(String name) {
        this.name = name;
        this.cant_unid = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCant_unid() {
        return cant_unid;
    }

    public void setCant_unid(int cant_unid) {
        this.cant_unid = cant_unid;
    }

    public Familias() {
    }

    @Override
    public String toString() {
        return name;
    }
    
}
