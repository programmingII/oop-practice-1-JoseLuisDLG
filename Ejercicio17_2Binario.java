//Jose Luis De La Cruz Gonzalez 13-02-2019 02:30 PM
import java.util.Scanner;
public class Ejercicio17_2Binario {
 public static void main(String[] args)
 {
  long binary1, binary2;
  int i = 0, remainder = 0;//Son enteros
  int[] sum = new int[20];//Es un contador
  Scanner in = new Scanner(System.in);//Nos permite poner un mensaje en la pantalla 

  System.out.print("Input first binary number: ");//Nos permite ingresar el numero binario
  binary1 = in.nextLong();//Nos permite invocar el escaner osea el mensaje
  System.out.print("Input second binary number: ");//Nos permite ingresar el numero binario
  binary2 = in.nextLong();//Nos permite invocar el escaner osea el mensaje

  while (binary1 != 0 || binary2 != 0) 
  {
   sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);// Nos permite sumar los numeros enteros de las siguientes operaciones
   remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);//Nos permite sumar los numeros enteros de las siguientes operaciones
   binary1 = binary1 / 10;//
   binary2 = binary2 / 10;
  }
  if (remainder != 0) {
   sum[i++] = remainder;
  }
  --i;
  System.out.print("Sum of two binary numbers: ");//Nos permite imprimir los 2 resultados de los sumas del los binarios
  while (i >= 0) {
   System.out.print(sum[i--]);//Nos imprime la suma	
  }
   System.out.print("\n");  
 }
}