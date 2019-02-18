//Jose Luis De La Cruz Gonzalez 15-02-2019 12:23 PM
import java.util.Scanner; // Se importa la libreria para escanear
public class Ejercicio19_BinDec {
      public static void main(String args[])
    {
        int dec_num, rem, quot, i=1, j; // Se declaran las variables
        int bin_num[] = new int[100]; // Se crea el contador que sera de un numero entero del 0 al 100
        Scanner scan = new Scanner(System.in); // Se crea el objeto que almacenara los numeros introducidos desde el teclado con el nombre scan
		
        System.out.print("Ingresa un numero entero : "); // Nos permite ingresar cualquier numero entero
        dec_num = scan.nextInt(); //Se almacena numero entero en la variable dec_num
		
        quot = dec_num;
		
        while(quot != 0)
        { //Se crea un ciclo while que se cumplira siempre que el Num sea diferente de 0
            bin_num[i++] = quot%2; //Se incrementara un variable exponente
            quot = quot/2;
        }
		
        System.out.print("El resultado en binario es : "); //Se imprime la suma de las operaciones de los numeros binarios
        for(j=i-1; j>0; j--)
        { //Ponemos una condicion de que el numero tiene que ser mayor a 0 
            System.out.print(bin_num[j]); // imprime un numero binario 
        }
        System.out.print("\n"); //Se imprime el numero binario en decimal
    }
}