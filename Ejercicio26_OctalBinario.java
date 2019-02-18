//Jose Luis De La Cruz Gonzalez 17-02-2019 9:35 PM
import java.util.Scanner;//Se importa la libreria para escanear
public class Ejercicio26_OctalBinario {
public static void main(String[] args) 
 {
  Scanner in = new Scanner(System.in);//Se crea el objeto que almacenara los numeros introducidos desde el teclado con el nombre scanner
  int[] octal_numvalues = {0, 1, 10, 11, 100, 101, 110, 111};//Se crean variables octales en entero
  long octal_num, tempoctal_num, binary_num, place;//Se crean variales con octal,binary
  int rem;//Se crean variables tipo entero
  System.out.print("Ingresa el numero en octal: ");//Nos permite ingresar un numero en octal
  octal_num = in.nextLong();//Se almacena una variable tipo octal
  tempoctal_num = octal_num;
  binary_num = 0;
  place = 1;
  while (tempoctal_num != 0) 
  {//Se crea ciclo while que se cumplira siempre que Num sea diferente de cero
   rem = (int)(tempoctal_num % 10);//Nos dice que el numero entero se va a multiplicar por el numero octal y dividir entre 10
   binary_num = octal_numvalues[rem] * place + binary_num;//Se hace la operacion para que pase de octal a binario
   tempoctal_num /= 10;
   place *= 1000;
  }
  System.out.print("Equivalent binary number: " + binary_num+"\n");//nos imprime el numero equivalente del binario
 }
}
