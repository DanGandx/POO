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
public class Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //ventana
        ventana  Ventana= new ventana();
        System.out.println(Ventana.alto);
        
        ventana Ventana1 = new ventana("1.5 m", "1.5 m", "cuadrado", "algodón", "duro");
        System.out.println(Ventana1.ancho);
        
        ventana Ventana2 = new ventana("circular", "tela");
        System.out.println(Ventana2.forma);
        
        Ventana.abrirVentana();
               
        //trastes
        trastes Trastes = new trastes();
        System.out.println(Trastes.forma);
        
        trastes Trastes1 = new trastes("Cuadrado", "azul", 20.00, "duro", "mediano" );
        System.out.println(Trastes1.tamaño);
        
        trastes Trastes2 = new trastes("gris", 0.1);
        System.out.println(Trastes2.color);
        
        Trastes.almacenar_comida();
        
        //televisores
        televisores Televisores = new televisores();
        System.out.println(Televisores.aplicaciones);
        
        televisores Televisores1 = new televisores(60, "FullHD", "Rgb", "Éstereo", "Youtube", "cable");
        System.out.println(Televisores1.resolución);
        
        televisores Televisores2 = new televisores(40, "1080p");
        System.out.println(Televisores2.pulgadas);
        
        Televisores.abrir_aplicacion();
        
        //camas
        camas Camas = new camas();
        System.out.println(Camas.suavidad_colchon);
        
        camas Camas1 = new camas("king", "spring air", 3, "30 cm", 5, "duro");
        System.out.println(Camas1.tipo_de_cama);
        
        camas Camas2 = new camas("individual","spring air");
        System.out.println(Camas2.colchon);
        
        Camas.acostar_en_la_cama();
        
        //ropa
        ropa Ropa = new ropa();
        System.out.println(Ropa.textura);
        
        ropa Ropa1 = new ropa("M","algodón", "café", "lizo", "ambiente");
        System.out.println(Ropa1.talla);
        
        ropa Ropa2 = new ropa("CH", "rosa");
        System.out.println(Ropa2.color);
        
        Ropa.poner_ropa();
    }
    
}
