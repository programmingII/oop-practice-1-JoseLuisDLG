//Jose Luis De La Cruz Gonzalez 16-02-2019 2:06 PM
import java.util.Scanner; //Se importa la libreria para escanear
public class Ejercicio21_Octal {
      public static void main(String args[])
    {
            int dec_num, rem, quot, i=1, j; //Se declaran las variables de tipo entero
        int oct_num[] = new int[100]; // Se crea el contador que sera de un numero entero octal del 0 al 100
        Scanner scan = new Scanner(System.in); // Se crea el objeto que almacenara los numeros introducidos desde el teclado con el nombre scan
		
        System.out.print("Ingresa un numero entero: "); // Nos permite un ingresar un numero entero
        dec_num = scan.nextInt(); //Se almacena numero entero en la variable dec
		
        quot = dec_num;
		
        while(quot != 0)
        { //Se crea ciclo while que se cumplira siempre que dec sea igual a 0
            oct_num[i++] = quot%8;
            quot = quot/8;
        }
		
        System.out.print("El resultado en numero octal es : ");// Se imprime el numero en octal 
        for(j=i-1; j>0; j--)
        { //Esta condicion nos dice que cuando el bucle sea igual a 1 se ejectura ya que 0 es falso
            System.out.print(oct_num[j]);// Se imprime si se cumple condicion
        }
		System.out.print("\n"); //Se imprime el resultado final de la  operacion
    }
}