//Jose Luis De La Cruz Gonzalez 16-02-2019 3:31 PM
import java.util.Scanner; //Se importa la libreria para leer los datos

public class Ejercicio22_BinaDecimal {

  public static void main(String[] args) {
    long numero, aux, digito, decimal;// se declaran varias variables
     int exponente;//se declara la variable entero
     boolean esBinario;
     Scanner sc = new Scanner(System.in); //Se crea una variable de tipo scanner
     do {
          System.out.print("Introduce un numero binario: "); //Se introduce un numero binario cualquiera
          numero = sc.nextLong(); //esto se crea para que los numeros se alarguen mas
          esBinario = true; //Nos dice que si es binario si se cumpla
          aux = numero;
          while (aux != 0) {
                     digito = aux % 10; 
                     if (digito != 0 && digito != 1) { 
                          esBinario = false; //nos dice que si no es un número binario no cumple con la funcion
                     }
                     aux = aux / 10; //quitamos la última cifra para repetir el proceso
           }
      } while (!esBinario); //nos vuelve a preguntar si el numero es binario
      exponente = 0;
      decimal = 0;
      while (numero != 0) {
                digito = numero % 10;
                decimal = decimal + digito * (int) Math.pow(2, exponente); //se multiplica por la potencia de 2 correspondiente y se suma al número
                exponente++;//el exponente aumenta
                numero = numero / 10;
      }
      System.out.println("Decimal: " + decimal); // Nos imprime el numero de binario a decimal
   }
}