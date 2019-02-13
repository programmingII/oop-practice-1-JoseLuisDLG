//Jose Luis De La Cruz Gonzalez 12-02-2019 11:11 PM
public class Ejercicio13_RecPeryA{
 
   public static void main(String[] strings) {

        final double width = 5.6;
        final double height = 8.5;

        double perimeter = 2*(height + width);
		
        double area = width * height;			
		
		System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);//imprime las funciones de dicha linea el perimetro

        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);//imprime las funciones de dicha linea el area
    }
}
