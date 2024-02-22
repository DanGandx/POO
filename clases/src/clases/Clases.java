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
        System.out.println("La medida del alto de la ventana es: " + Ventana.alto + " cm");
        
        ventana Ventana1 = new ventana(1.5 , 1.5 , "cuadrado", "algodón", "duro");
        System.out.println(Ventana1.ancho);
        
        ventana Ventana2 = new ventana("circular", "tela");
        System.out.println("La forma de la ventana es: " + Ventana2.forma);
        
        Ventana.abrirVentana();
        
        System.out.println("El area de la ventana es: " + Ventana.getArea());
        System.out.println("");
               
        //trastes
        trastes Trastes = new trastes();
        System.out.println("La forma del traste es: " + Trastes.forma);
        
        trastes Trastes1 = new trastes("Cuadrado", "azul", 20.00, "duro", "mediano" );
        System.out.println("El tamaño del traste es: " + Trastes1.tamaño);
        
        trastes Trastes2 = new trastes("gris", 0.1);
        System.out.println("El color del traste es: " + Trastes2.color);
        
        Trastes.almacenar_comida();
        
        System.out.println("El volumen (predeterminado) del plato es: " + Trastes.getVolumen());
        System.out.println("");
        
        //televisores
        televisores Televisores = new televisores();
        System.out.println("La app seleccionada es: " + Televisores.aplicaciones);
        
        televisores Televisores1 = new televisores(60, "FullHD", "Rgb", "Éstereo", "Youtube", "cable");
        System.out.println("La resolución de la tele es: " + Televisores1.resolución);
        
        televisores Televisores2 = new televisores(40, "1080p");
        System.out.println("Las pulgadas de la tele es: " + Televisores2.pulgadas);
        
        Televisores.abrir_aplicacion();
        
        System.out.println("El area (predeterminado) de la tele es: " + Televisores.getArea());
        System.out.println("");
        
        //camas
        camas Camas = new camas();
        System.out.println("La suavidad del colchon es: " + Camas.suavidad_colchon);
        
        camas Camas1 = new camas("king", "spring air", 3, "30 cm", 5, "duro");
        System.out.println("El tipo de cama es: " + Camas1.tipo_de_cama);
        
        camas Camas2 = new camas("individual","spring air");
        System.out.println("El tipo de colchon es: " + Camas2.colchon);
        
        Camas.acostar_en_la_cama();
        
        System.out.println("La cantidad de objetos en la cama son: " + Camas.getObjetosCama());
        System.out.println("");
        
        //ropa
        ropa Ropa = new ropa();
        System.out.println("La textura de la ropa es: " + Ropa.textura);
        
        ropa Ropa1 = new ropa("M","algodón", "café", "lizo", "ambiente");
        System.out.println("La talla de la ropa es: " + Ropa1.talla);
        
        ropa Ropa2 = new ropa("CH", "rosa");
        System.out.println("El color de la ropa es: " + Ropa2.color);
        
        Ropa.poner_ropa();
        
        System.out.println("El perimetro (predeterminado) de la playtera es: " + Ropa.getPerimetro() + " cm");
    }
    
}
