
package spp.cbarraganc.t01.pkg3;
import java.util.Scanner;
/**
 *
 * @author Carlos Javier Barragán Carrión
 * Matrícula: A01410357
 * Carrera: IMT
 */
public class SPPCBarraganCT03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x1, x2, y1, y2;
        double distancia;
        System.out.println("Inroduce la coordenada X del primer punto: ");
        Scanner entradaX1 = new Scanner(System.in);
        x1 = entradaX1.nextDouble();
         System.out.println("Introdue la coordenada Y del pirmer punto: ");
        Scanner entradaY1 = new Scanner(System.in);
        y1= entradaY1.nextDouble();
        System.out.println("Inroduce la coordenada X del segundo punto: ");
        Scanner entradaX2 = new Scanner(System.in);
        x2 = entradaX2.nextDouble();
       
        System.out.println("Inroduce la coordenada Y del segundo punto: ");
        Scanner entradaY2 = new Scanner(System.in);
        y2 = entradaY2.nextDouble();
        
        distancia=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1+y2,2));
        
        System.out.println("==================================================================");
        System.out.println("\nDistancia entre los 2 puntos: " + distancia);
    }
    
}
