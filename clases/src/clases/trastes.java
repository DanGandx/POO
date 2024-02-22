/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *
 * @author invitado
 */
public class trastes {
    
    String forma;
    String color;
    double profundidad_cm;
    double area = 314.16;
    String resistencia;
    String tamaño;

    public trastes() {
        
    forma = "redonda";
    color = "blanco";
    profundidad_cm = 0.5;
    resistencia = "frágil";
    tamaño = "pequeño";
    }

    public trastes(String forma, String color, double profundidad_cm, String resistencia, String tamaño) {
        this.forma = forma;
        this.color = color;
        this.profundidad_cm = profundidad_cm;
        this.resistencia = resistencia;
        this.tamaño = tamaño;
    }


    public trastes(String color, double profundidad_cm) {
        this.color = color;
        this.profundidad_cm = profundidad_cm;
      
    }
    
    public double getVolumen(){
        return this.area * this.profundidad_cm;
    }
    
    
  public void sostener_comida() {
      System.out.println("Se está sosteniendo la comida");
  }
  public void almacenar_comida() {
      System.out.println("Se almacena la comida");
  }
  public void calentar_traste() {
      System.out.println("Se está calentando el traste");
  }
   
}
