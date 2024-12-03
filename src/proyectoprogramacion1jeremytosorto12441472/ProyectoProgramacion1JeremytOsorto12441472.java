/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoprogramacion1jeremytosorto12441472;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class ProyectoProgramacion1JeremytOsorto12441472 {
    static GUIproyecto pro=new GUIproyecto();
    static ArrayList <Producto> lista_productos=new ArrayList();
    static ArrayList <Familias> lista_familias=new ArrayList();
    static Scanner lee=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Desea iniciar a gestinar su inventario? [S,N]");
        String son=lee.next();
        
        if(son.equalsIgnoreCase("S")){
            pro.setVisible(true);
        }
        else{
            System.out.println("Ok :(");
        }
    }
    
    
   public void agregaralista(Producto pro){
       lista_productos.add(pro);
   } 
   
   public void agregarfamilia(Familias fami){
       lista_familias.add(fami);
   }
}
