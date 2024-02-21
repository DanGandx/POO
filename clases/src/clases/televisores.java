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
public class televisores {
    
  int pulgadas;
  String resolución;
  String color_imagen;
  String sonido;
  String aplicaciones;
  String conexión_electricidad;
  

    public televisores() {
    pulgadas = 60;
    resolución = "4k";
    color_imagen = "RGB";
    sonido = "estéro";
    aplicaciones = "Netflix";
    conexión_electricidad = "cable";
    }

    public televisores(int pulgadas, String resolución, String color_imagen, String sonido, String aplicaciones, String conexión_electricidad) {
        this.pulgadas = pulgadas;
        this.resolución = resolución;
        this.color_imagen = color_imagen;
        this.sonido = sonido;
        this.aplicaciones = aplicaciones;
        this.conexión_electricidad = conexión_electricidad;
        
    }

    public televisores(int pulgadas, String resolución) {
        this.pulgadas = pulgadas;
        this.resolución = resolución;
    }
  
  public void encender_televisor() {
      System.out.println("Se encendió el televisor");
  }
  public void reproducir_video() {
      System.out.println("Reproduciendo un video");
  }
  public void abrir_aplicacion() {
      System.out.println("Se está abriendo " + aplicaciones);
  }
  public void apagar_televisor() {
      System.out.println("Apagando televisor");
  }
}
