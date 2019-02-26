//Jose Luis De La Cruz Gonzalez 25-02-2019 08:20 PM
import java.util.*;//Nos permite importar alguna clase del paquete que necesitamos para la linea de codigo
 public class Ejercicio62_VeinteoMenos {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);//Nos crea el objeto in para almacenar datos
        System.out.print("Ingresa el primer numero: ");//Nos permite ingresar nuestro primer numero
        int x = in.nextInt();  
		System.out.print("Ingresa el segundo numero: ");//Nos permite ingresar nuestro segundo numero
		int y = in.nextInt(); 
		System.out.print("Ingresa el tercer numero: ");//Nos permite ingresar nuestro tercer numero
        int z = in.nextInt(); 
        System.out.println((Math.abs(x - y) >= 20 || Math.abs(y - z) >= 20 || Math.abs(z - x) >= 20));//Utilizamos el metodo abs de la clase math, el cual nos permite obtener el valor absoluto de una operacion
    }
}