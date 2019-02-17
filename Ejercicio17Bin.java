//José Luis De La Cruz Gonzalez 15-02-2019 8:47 AM
import java.util.Scanner;
public class Ejercicio17Bin {
 public static void main(String[] args)
 {
  long binary1, binary2;//el metodo long nos permite poner numeros mucho mas largos
  int i = 0, remainder = 0;//nos dice que los valores van a empezar desde 0
  int[] sum = new int[20];//es un contador que nos permite sumar los numeros hasta el numero 20
  Scanner in = new Scanner(System.in);

  System.out.print("Ingresa el primer numero binario: ");//Nos permite ingresar nuestro primer numero
  binary1 = in.nextLong();//Nos permite guardar el numero que pusimos antes 
  System.out.print("Ingresa el segundo numero binario: ");//Nos permite ingresar nuestro primer numero
  binary2 = in.nextLong();//Nos permite guardar el numero que pusimos antes
  while (binary1 != 0 || binary2 != 0) //si la condicion es verdadera que el numero banario es diferente a cero y el numero binario 2 es diferente a cero entonces se realiza la funcion
  {
   sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);//Nos dice el procedimiento a seguir del cual hara las operaciones nuestros 2 numeros
   remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);//El resultado anterior la suma hara el mismo proceso pero al final lo dividira entre 2
   binary1 = binary1 / 10;
   binary2 = binary2 / 10;
  }
  if (remainder != 0) {
   sum[i++] = remainder;
  }
  --i;
  System.out.print("Suma de los 2 numeros binarios : ");// nos imprime la suma de nuestros numeros binarios
  while (i >= 0) {
   System.out.print(sum[i--]);
  }
   System.out.print("\n");  
 }
}