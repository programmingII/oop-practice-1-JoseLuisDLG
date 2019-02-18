//Jose Luis De La Cruz Gonzalez 17-02-2019 08:44 PM
import java.util.Scanner;//Se importa la libreria para escanear
public class Ejercicio25_OctalDecimal {
public static void main(String[] args) 
   {
     Scanner in = new Scanner(System.in); //Se crea el objeto que almacenara los numeros introducidos desde el teclado con el nombre scanner
     long octal_num, decimal_num = 0;//se definen las variable long
     int i = 0;
     System.out.print("Ingresa un numero octal: ");//Nos permite ingresar un numero octal
    octal_num = in.nextLong();//Se almacena numero entero en la variable octal
    while (octal_num != 0) 
     {//Se crea ciclo while que se cumplira siempre que Num sea diferente de cero
      decimal_num = (long)(decimal_num + (octal_num % 10) * Math.pow(8, i++));//Nos hace la operacion que nos dice sumamos el decimal mas el octal entre 10
      octal_num = octal_num / 10;
     }
    System.out.print("Equivalente a forma decimal es : " + decimal_num+"\n");//Nos imprime el equivalente a decimal del octal
   }
}