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
public class camas {
    
    String tipo_de_cama;
    String colchon;
    int almohadas_cantidad;
    String altura;
    int cobijas_cantidad;
    String suavidad_colchon;   

    public camas() {
    tipo_de_cama = "queen";
    colchon = "Spring air";
    almohadas_cantidad = 5;
    altura = "60 cm";
    cobijas_cantidad = 5;
    suavidad_colchon = "Suave";
    }

    public camas(String tipo_de_cama, String colchon, int almohadas_cantidad, String altura, int cobijas_cantidad, String suavidad_colchon) {
        this.tipo_de_cama = tipo_de_cama;
        this.colchon = colchon;
        this.almohadas_cantidad = almohadas_cantidad;
        this.altura = altura;
        this.cobijas_cantidad = cobijas_cantidad;
        this.suavidad_colchon = suavidad_colchon;
    }

    public camas(String tipo_de_cama, String colchon) {
        this.tipo_de_cama = tipo_de_cama;
        this.colchon = colchon;
    }
     
        
  public void acostar_en_la_cama() {
      System.out.println("Te haz acostado");
  }
  public void bajar_de_la_cama() {
      System.out.println("Te haz bajado de la cama");
  }
  public void tender_cama() {
      System.out.println("Haz tendido la cama");
  }
    
}
