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
  String control_remoto;

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
