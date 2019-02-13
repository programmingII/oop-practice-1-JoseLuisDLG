//Jose Luis De La Cruz Gonzalez 12-02-2019 07:59 PM
public class Ejercicio11_AreayPeri {
 
   private static final double radius = 9.5;//el static nos permite acceder a una variable desde otra clase sin la necesidad de poner el objeto 

    public static void main(String[] args) {

        double perimeter = 2 * Math.PI * radius;//operaciones
        double area = Math.PI * radius * radius;//operaciones

        System.out.println("Perimeter is = " + perimeter);//imprime la operacion del perimetro
        System.out.println("Area is = " + area);//imprime la operacion del area
    }
}