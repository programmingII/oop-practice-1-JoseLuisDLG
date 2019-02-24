//Jose Luis De La Cruz Gonzalez 24-02-2019 04:12 PM
import java.util.Scanner;//Se importa la libreria scanner 
public class Ejercicio44_3Valores {
 public static void main(String[] args) {

  int n;//Se declara una variable de tipo entero
  char s1, s2, s3;//Se declara un caracter
  Scanner in = new Scanner(System.in);//se crea el objeto in que almacenara datos
  System.out.print("Introduce Numero ");//Nos permite introducir el numero
  n = in .nextInt();
  System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);//se imprime el valor
 }
}