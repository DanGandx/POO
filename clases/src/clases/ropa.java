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
public class ropa {
    
  String talla;
  String tela;
  String color;
  String textura;
  String temperatura;

    public ropa() {
    talla = "M" ;
    tela = "Algodón";
    color = "guinda";
    textura = "lizo";
    temperatura = "ambiente";
    }

    public ropa(String talla, String tela, String color, String textura, String temperatura) {
        this.talla = talla;
        this.tela = tela;
        this.color = color;
        this.textura = textura;
        this.temperatura = temperatura;
    }

    public ropa(String talla, String color) {
        this.talla = talla;
        this.color = color;
    }
  
    
  public void poner_ropa() {
      System.out.println("Te pusiste la ropa");
  }
  public void ajustar_ropa() {
      System.out.println("Te ajustas la ropa");
  }
  public void quitar_ropa() {
      System.out.println("Te quitas la ropa");
  }
  public void doblar_ropa() {
      System.out.println("Doblas la ropa");
  }
  
}
