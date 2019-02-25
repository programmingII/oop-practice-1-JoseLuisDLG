//Jose Luis De La Cruz Gonzalez 24-02-2019 05:23 PM
import java.util.*;//Nos permite importar la libreria java util
 public class Ejercicio49_Siempreimpar{
     public static void main(String[] args){
	 Scanner in = new Scanner(System.in);////Se crea el objeto num en el que se almacenaran datos
	 System.out.print("Ingresa numero: ");//Nos permite ingresar el numero 
     int n = in.nextInt(); //Se almacena el numero entero en n
            if (n % 2 == 0) {//Si el residuo del numero entre 2 es cero es par
                System.out.println(1); //Se imprime el segundo numero
               }
			else {
                System.out.println(0); //Se imprime el primer numero
              }
     }
}