//Jose Luis De La Cruz Gonzalez 13-02-2019 03:21PM
import java.util.Scanner;
public class Ejercicio18_BinarioMul {
 public static void main(String[] args)
 {
  long binary1, binary2, multiply = 0;
  int digit, factor = 1;
  Scanner in = new Scanner(System.in);//Nos permite ingresar un mensaje en la pantalla
  System.out.print("Input the first binary number: ");//Nos permite ingresar un numero binario
  binary1 = in.nextLong();//Nos permite invocar el escaner osea el mensaje
  System.out.print("Input the second binary number: ");//Nos permite ingresar un numero binario
  binary2 = in.nextLong();//Nos permite invocar el escaner osea el mensaje
  while (binary2 != 0)
  {
   digit = (int)(binary2 % 10);
   if (digit == 1) 
   {
    binary1 = binary1 * factor;
    multiply = binaryproduct((int) binary1, (int) multiply);//Nos da el valor del producto binario entero
   } 
   else
   {
    binary1 = binary1 * factor;
   }
   binary2 = binary2 / 10;
   factor = 10;
  }
  System.out.print("Product of two binary numbers: " + multiply+"\n");//Nos imprime el producto de los dos numeros binarios
 }
 static int binaryproduct(int binary1, int binary2) 
 {
  int i = 0, remainder = 0;
  int[] sum = new int[20];
  int binary_prod_result = 0;

  while (binary1 != 0 || binary2 != 0) 
  {
   sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;//Nos imprime la operacion de suma entre el numero binario 1 y el numero binario 2 despues le saca el 2 porciento de ese resultado
   remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;//Nos imprime la operacion de suma entre el numero binario 1 y el numero binario 2 despues lo divide entre 2 el resultado
   binary1 = binary1 / 10;
   binary2 = binary2 / 10;
  }
  if (remainder != 0)
  {
   sum[i++] = remainder;
  }
  --i;
  while (i >= 0) 
  {
   binary_prod_result = binary_prod_result * 10 + sum[i--];//nos da como resultado todas operaciones de numeros binarios
  }
  return binary_prod_result;
 }
 }
 