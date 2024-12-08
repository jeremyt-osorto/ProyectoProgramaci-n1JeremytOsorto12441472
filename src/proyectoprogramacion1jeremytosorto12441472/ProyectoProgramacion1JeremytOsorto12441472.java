/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoprogramacion1jeremytosorto12441472;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author DELL
 */
public class ProyectoProgramacion1JeremytOsorto12441472 {
    static GUIproyecto pro=new GUIproyecto();
    static ArrayList <Producto> lista_productos=new ArrayList(); //ArrayList
    static ArrayList <Familias> lista_familias=new ArrayList();
    static Scanner lee=new Scanner(System.in);
    static Producto[] pr= new Producto[10]; //Array
    static Familias[][] lc=new Familias[10][10];//Matriz;
    static int n=0, m=0,c=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUIproyecto li=new GUIproyecto(lista_familias);
        
        Familias tu=new Familias("Holap");
        lista_familias.add(tu);
        
        do{
            System.out.print("Desea iniciar a gestinar su inventario? [S,N] "); //System.out.print
            String son=lee.next(); //Scanner.

            if(son.equalsIgnoreCase("S")){
                pro.setVisible(true);
                break;
            }
            else{
                System.out.println("Ok :(");
                break;
            }
        } while (true); //loops
    }
    
    //Metodos no estaticos.
   public void agregaralista(Producto pro){
       lista_productos.add(pro);
       for (int i=0; i<pr.length; i++){
        pr[n]=pro;
       }
   } 
   
   public void agregarfamilia(Familias fami){
       lista_familias.add(fami);
       for (int i=0; i<lc.length;i++){
           for (int b=0; b<lc.length; b++){
               lc[m][c]=fami;
           }
       }
   }
   
   public ArrayList<Producto> listap(){
       return lista_productos;
   }
}
