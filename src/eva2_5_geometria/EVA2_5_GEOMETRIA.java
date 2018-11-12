/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_geometria;

/**
 *
 * @author Bryan Rivera Villaseñor 18550367
 */
public class EVA2_5_GEOMETRIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Area de un cuadro de lado 100 = " +
        Geometria.calculaAreaCuadrado(100));
       Geometria oObj = new Geometria();
       
    }
    
    
}
class Geometria{
    /*LOs metodos estaticos existen desde que el programa inicia ,
    y solamente se pueden usar a traves de la clase a la que
    pertenecen. NO SON INSTANCIAS
    */
    static final double PI = 3.14159; 
public static double calculaAreaCuadrado(double dLado){
        return dLado * dLado;
}
public static double calculaAreaRectangulo(double dBase, double dAltura){
        return dBase * dAltura;
}
public static double calculaAreaTriangulo (double bBase, double bAltura){
        return (bBase * bAltura)/2;
}
public static double calculaAreaCirculo(double Radio){
        return  PI * (Radio * Radio);
}
}