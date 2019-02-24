//Jose Luis De La Cruz Gonzalez 24-02-2019 01:30 PM
import java.util.Scanner;

public class Ejercicio35_AreadePoligono {
    
  public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//Declaramos las variables en el scanner para poder leer las teclas
        System.out.print("Ingrese el número de lados en el polígono: ");//Nos permite ingresar el numero de lados de un poligono
        int ns = input.nextInt();//Le damos valores a la variable
        System.out.print("Ingrese la longitud de uno de los lados: ");//Ingresamos la longitud de los lados de la variabl
        double side = input.nextDouble();//Le damos valores a la variable double
        System.out.print("el area es: " + polygonArea(ns, side)+"\n");//nos imprime el area del poligono
    }
    public static double polygonArea(int ns, double side) {
        return (ns * (side * side)) / (4.0 * Math.tan((Math.PI / ns)));//Nos imprime la formula del area del un poligono
    }
}