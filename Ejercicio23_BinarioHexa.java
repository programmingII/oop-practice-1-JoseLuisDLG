//Jose Luis De La Cruz Gonzalez 16-02-2019 4:12 PM
import java.util.Scanner;//Se importa la libreria de escaner
public class Ejercicio23_BinarioHexa {
 public static void main(String[] args) 
 {
  int[] hex = new int[1000]; // Se crea el contador que sera de un numero entero del 0 al 1000
  int i = 1, j = 0, rem, dec = 0, bin;//Se declaran varias variables de tipo entero
  Scanner in = new Scanner(System.in); //Se crea el objeto que almacenara los numeros introducidos desde el teclado con el nombre scaner
  System.out.print("Ingresa un numero binario: ");//Se ingresa un numero binario
  bin = in.nextInt();//Se almacena un numero en la variable bin
  while (bin > 0) {//nos dice que si el numero binario es mayor a 0
   rem = bin % 2;// entonces el numero binario es divido entre 2
   dec = dec + rem * i;//Se suma el numero decimal mas el residuo por el incremento
   i = i * 2;//el incremento por 2
   bin = bin / 10;
  }
   i = 0;
  while (dec != 0) {//Nos dice que si el decimal es igual a 0
   hex[i] = dec % 16;//entonces el decimal se divide entre 16
   dec = dec / 16;
   i++;//aumenta el numero
  }
  System.out.print("El valor en HexaDecimal es : ");//Nos imprime el valor del numero hexadecimal
  for (j = i - 1; j >= 0; j--)
  {//solo si ekl incremento es menos que un numero o si es igual a 0
   if (hex[j] > 9) 
   {
    System.out.print((char)(hex[j] + 55)+"\n");//nos imprime los numeros hexadecimal
   } else
   {
    System.out.print(hex[j]+"\n");//nos imprime el numero hexadecimal
   }
  }
 }
}