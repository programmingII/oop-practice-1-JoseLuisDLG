//Jose Luis De La Cruz Gonzalez 24-02-2019 12:57 PM
import java.util.Scanner;//Importamos la libreria para que nos deje utlizar el scanner
public class Ejercicio34_AreaHexagono {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//nos permite declarar el scanner para poder utilizar las teclas
        System.out.print("Introduzca la longitud de un lado del hexágono: ");//Nos permite imprimir la longitud del octagono
        double s = input.nextDouble();//Nos permite declarar doble s para utlizar las teclas
        System.out.print("El area del hexagono es: " + hexagonArea(s)+"\n");//Nos permite imprimir el area del hexagono
    }
    public static double hexagonArea(double s) {
        return (6*(s*s))/(4*Math.tan(Math.PI/6));//hace la operacion del area del hexagono
    }
}